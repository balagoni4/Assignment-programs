import java.util.Scanner;

class sumn
{
    public static void main(String args[])
    {
        int i=1,n,sum=0;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("enter any value");
        n=sc.nextInt();
          
        
        while (i<=n)
        {
            sum = sum + i; 
            i++;
        }
      System.out.println("sum is :" + sum);
    }
}