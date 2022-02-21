import java.util.Scanner;

class firstClass
{
    public static void main(String args[])
    {
         int l;
         int b;
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
        
        int area=(l*b);
       int perimeter=(2*(l+b));
   
         System.out.println("The area of rectangle is:"+area);
         System.out.println("The perimeter of rectangle is:"+perimeter);
    }
}