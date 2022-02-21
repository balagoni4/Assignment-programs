import java.util.Scanner;
 class RangeArm
{
   public static void main(String args[])
   {
      int a,b,i;
       int c, r, sum = 0;
       
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      a= sc.nextInt();
      System.out.println("Enter the second number ::");
      b= sc.nextInt();

      for ( i = a; i<b; i++){
        
         c = i;
         while(c!= 0)
         {
            r = c % 10;
            sum = sum + (r * r * r);
            c= c/10;
         }
         if(sum == i)
         {
            System.out.println(""+i+" is an Armstrong number.");
         }
         else
         System.out.println(""+i+" is not an Armstrong number.");
      }
   }
}