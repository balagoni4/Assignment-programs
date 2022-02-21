import java.util.*;
 class String2
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
         String st1,st2;
      System.out.println("Enter a string:");
       st1=sc.next();
      
      for (int i=st1.length()-1;i>=0;i--)
      {
         st2=st2+st1.charAt(i);
      }
      if (st1.equalsIgnoreCase(st2))
      {
         System.out.println(st1 + " Palindrome string"); 
      }
      else
      {
          System.out.println(st1 +" is not a Palindome string");
      }
   }
}