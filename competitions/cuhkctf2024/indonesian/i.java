import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class IndonesianCulture {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Date var2 = new Date();
      SimpleDateFormat var3 = new SimpleDateFormat("dd/MM/yyyy");
      String var4 = var3.format(var2);
      System.out.print("Enter a string: ");
      String var5 = var1.nextLine();
      String var6 = "p3n9uinIsAw3s0ne" + var4;
      var1.close();
      if (var5.equals(var6)) {
         System.out.println("The input is correct!");
         readFlagFromFile();
      } else {
         System.out.println("The input is incorrect.");
      }

   }

   private static void readFlagFromFile() {
      try {
         BufferedReader var0 = new BufferedReader(new FileReader("flag.txt"));
         String var1 = var0.readLine();
         System.out.println("Flag: " + var1);
         var0.close();
      } catch (IOException var2) {
         System.out.println("Error reading flag from file: " + var2.getMessage());
         System.out.println("If you encountered this message when running your code on the competition server, contact challenge author p3n9uin immediately by opening a ticket on the competition Discord server.");
      }

   }
}
