import java.util.*;
class ArrayS
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter elements to array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           
        }
        System.out.println("The elements in an array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("sum of array is:"+sum);
    }
}
