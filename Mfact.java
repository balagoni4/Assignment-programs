import java.util.*;
class example
{
    int i,n,fact=1;
    
       void fact()
    {
         Scanner sc=new Scanner(System.in);
    System.out.println("Enter any value");
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
     System.out.println("The factorial of number is:" + fact);
  }
 }
class Mfact
{
    public static void main(String args[])
    {
        example f=new example();
        f.fact();
    }
}