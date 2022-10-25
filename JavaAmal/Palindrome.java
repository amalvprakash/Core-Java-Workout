import java.util.*;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String og, reverse = ""; 
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      og = in.nextLine();   
      int length = og.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + og.charAt(i);  
      if (og.equals(reverse))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string isn't a palindrome.");   
   }  
}  