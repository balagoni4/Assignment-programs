import java.util.Scanner;

class cif
{
    public static void main(String args[])
    {
        int personage;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter person's age");
        personage=sc.nextInt();
          
        
        if (personage>18)
        {
            System.out.println("person is eligible for voting");
        }
        else
        {
            System.out.println("person is not eligible for voting");
        }
    }
}