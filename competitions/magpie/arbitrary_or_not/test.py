from ecdsa import SigningKey, NIST224p
from ecdsa.util import sigencode_string, sigdecode_string
from ecdsa.numbertheory import inverse_mod
from hashlib import sha1

def attack(publicKeyOrderInteger, signaturePair1, signaturePair2, messageHash1, messageHash2): 
    r1 = signaturePair1[0]
    s1 = signaturePair1[1]
    r2 = signaturePair2[0]
    s2 = signaturePair2[1]

    #Convert Hex into Int
    L1 = int(messageHash1, 16)
    L2 = int(messageHash2, 16)

    if (r1 != r2):
        print("ERROR: The signature pairs given are not susceptible to this attack")
        return None

    #A bit of Math 
    #L1 = Hash(message_1) 
    #L2 = Hash(message_2)
    #pk = Private Key (unknown to attacker)
    #R  = r1 == r2
    #K  = K value that was used (unknown to attacker)
    #N  = integer order of G (part of public key)
    
    #         From Signing Defintion
    #s1 = (L1 + pk * R) / K Mod N    and     s2 = (L2 + pk * R) / K Mod N
    
    #         Rearrange 
    #K = (L1 + pk * R) / s1 Mod N    and     K = (L2 + pk * R) / s2 Mod N
    
    #         Set Equal
    #(L1 + pk * R) / s1 = (L2 + pk * R) / s2     Mod N
    
    #         Solve for pk (private key)
    #pk Mod N = (s2 * L1 - s1 * L2) / R * (s1 - s2)
    #pk Mod N = (s2 * L1 - s1 * L2) * (R * (s1 - s2)) ** -1

    numerator = (((s2 * L1) % publicKeyOrderInteger) - ((s1 * L2) % publicKeyOrderInteger))
    denominator = inverse_mod(r1 * ((s1 - s2) % publicKeyOrderInteger), publicKeyOrderInteger)

    privateKey = numerator * denominator % publicKeyOrderInteger

    return privateKey

if __name__ == "__main__":
    ### PROOF OF CONCEPT ####

    #Messages to be signed
    message_1 = str("123123")
    message_2 = str("456456")

    #Generates the private key using the NIST224p curve, and SHA-1 hash function
    sk = SigningKey.generate(curve=NIST224p)

    #This is the secret number used to sign messages
    actualPrivateKey = sk.privkey.secret_multiplier

    #gets the public key (vk) 
    vk = sk.get_verifying_key()

    print("vk_point:", vk.pubkey.point.x(), vk.pubkey.point.y())
    print("vk_order:", vk.pubkey.order)

    #Signing a message 
    signature = sk.sign(message_1.encode('utf-8'),k=22)

    #Pulling out the Signature Pair
    r1, s1 = sigdecode_string(signature, vk.pubkey.order)
    
    #Singing a second message using the same K value, using the same K value is what opens ECDSA to attack 
    signature2 = sk.sign(message_2.encode("utf-8"),k=22)

    #Pulling out the second Signature Pair (Note: r1 == r2 due to the K value being the same)
    r2, s2 = sigdecode_string(signature2, vk.pubkey.order)

    #Get message Hash 
    messageHash1 = sha1(message_1.encode('utf-8')).hexdigest()
    messageHash2 = sha1(message_2.encode('utf-8')).hexdigest()

    #Start the attack
    # print("r1, s1:", (r1,s1))
    # print("r2, s2:", (r2,s2))
    # print("m1_hash:", messageHash1)
    # print("m2_hash:", messageHash2)
    privateKeyCalculation = attack(vk.pubkey.order, (r1,s1), (r2,s2), messageHash1, messageHash2)
    
    #By compairing the actual secret key with calculation we can prove that we have just solved for the private key
    print(actualPrivateKey)
    print(privateKeyCalculation)