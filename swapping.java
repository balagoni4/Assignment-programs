import java.util.Scanner;

class swapping
{
    public static void main(String args[])
    {
        int t,a,b;
        
    
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter a value");
        a=sc.nextInt();
         System.out.println("Enter b value");
         b=sc.nextInt();
         
         System.out.println("Before swapping:"); 
         System.out.println("a="+a);
         System.out.println("b="+b);
         
          System.out.println("After swapping:"); 
          t=a;
          a=b;
          b=t;
         System.out.println("a="+a);
         System.out.println("b="+b);
    }
}