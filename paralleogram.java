import java.util.Scanner;

class paralleogram
{
    public static void main(String args[])
    {
        int h,b;
        float  area,circumference;
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter height of paralleogram");
         h=sc.nextInt();
         System.out.println("Enter breadth of paralleogram");
         b=sc.nextInt();
      area=h*b;
      circumference=2*(h+b);
      
      System.out.println("Area of paralleogram is :"+area);
      System.out.println("circumference of paralleogram is :"+ circumference);
    }
}