import java.util.Scanner;

class leapyear
{
    public static void main(String args[])
    {
        int year;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter year");
         year=sc.nextInt();
          
        
        if (year%4==0)
        {
            System.out.println("The given year is leap year");
        }
        else
        {
            System.out.println("The given year is not leap year");
        }
    }
}