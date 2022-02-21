import java.util.*;
class String4
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String str= sc.next();
     
       String words[]=str.split(" ");
       
       for(int i=words.length-1;i>=0;i--)
       {
           System.out.print(words[i]+" ");
       }
    }
}