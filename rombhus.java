import java.util.Scanner;

class rombhus
{
    public static void main(String args[])
    {
        int d1,d2;
     float a,area,circumference;
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter diagonal1 of rombhus");
         d1=sc.nextInt();
         System.out.println("Enter diagonal2 of rombhus");
         d2=sc.nextInt();
          System.out.println("Enter side of rombhus");
         a=sc.nextInt();
          
      area=(d1*d2)/2;
      circumference=(4*a);
      
      System.out.println("Area of rombhus is :"+area);
      System.out.println("circumference of rombhus is :"+circumference);
    }
}