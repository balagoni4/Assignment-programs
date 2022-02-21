import java.util.*;
 
class Array9
{
    public static void main(String args[])
    {
         int n,i;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];
 int even = 0, odd = 0;
 
    System.out.println("Enter the elements of the array: ");
    for( i=0; i<n; i++)
     {
        a[i] = sc.nextInt();
    }
       
        for ( i = 0; i < a.length; i++) {
            if (i % 2 == 0)
                even += a[i];
            else
                odd += a[i];
        }
 
        System.out.println("Even index positions sum: " + even);
        System.out.println("Odd index positions sum: " + odd);
    }
}