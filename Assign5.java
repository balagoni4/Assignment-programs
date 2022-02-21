import java.util.Scanner;
class Assign5
{  
 public static void main(String args[])
 {
      int i,n,p;
    Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter the number of elements:") ;
  n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
 
     
 System.out.println("Enter the position of the number which is to be deleted");
 p = sc.nextInt();
    
 for(i=p;i<n-1;i++)
     	{
         a[i]=a[i+1];
     }
     n=n-1;
     
 System.out.println("\nOn deleting new array we get is\n");
     for(i=0;i<n;i++) 
     {
         System.out.println("a["+i+"] = "+a[i]);
     }
 }
}

 int max=0;
        for (i=0,i<n;i++)
        {
            a[i]=max;
        for (j=i+1;j<n;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
             System.out.println("Max element is :" +max);
        }