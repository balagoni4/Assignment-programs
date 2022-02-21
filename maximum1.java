import java.util.Scanner;

class maximum1
{
    public static void main(String args[])
    {
        int a,b;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("enter a value");
        a=sc.nextInt();
           System.out.println("enter b value");
        b=sc.nextInt();
        
        if (a>b)
        {
            System.out.println("A is big");
        }
        else
        {
            System.out.println("B is big");
        }
    }
}