import java.util.Scanner;

class variables
{
    public static void main(String args[])
    {
        int a,b,c;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter first variable");
         a=sc.nextInt();
       System.out.println("Enter second variable");
         b=sc.nextInt();
         System.out.println("Enter third variable");
         c=sc.nextInt();
        
        if (a==b && b==c && c==a)
        {
            System.out.println("All variables are equal");
        }
        else
        {
            System.out.println("All variables are not equal");
        }
    }
}