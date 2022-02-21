import java.util.Scanner;

class interest
{
    public static void main(String args[])
    {
        int pamount;
        float interest;
        float months;
        float simpleinterest;
        float totalamount;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter principal amount");
        pamount=sc.nextInt();
          System.out.println("Enter rate of interest");
        interest=sc.nextFloat();
         System.out.println("Enter number of months");
        months=sc.nextFloat();
       
       simpleinterest=((pamount*interest*months)/100);
       totalamount =simpleinterest+pamount;
       
       System.out.println("The simple Interest is :" +simpleinterest);
          System.out.println("The total amount is :" +totalamount);
    }
}