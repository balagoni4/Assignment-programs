import java.util.Scanner;

class positive
{
    public static void main(String args[])
    {
        int number;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
         number=sc.nextInt();
          
        
        if (number>0)
        {
            System.out.println("The given number is positive");
        }
        else
        {
            System.out.println("The given number is negative");
        }
    }
}