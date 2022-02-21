import java.util.*;
 class String1
{
   public static void main(String args[])
   {
       int n,i;
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String s= sc.next();
       n=s.length();
      for(i=n-1;i>=0;i--)
      {
          System.out.print(s.charAt(i));
      }
   }
}