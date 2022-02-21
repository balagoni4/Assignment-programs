import java.util.Scanner;

class even
{
    public static void main(String args[])
    {
        int number;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
         number=sc.nextInt();
          
        
        if (number%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
}