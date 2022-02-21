/*import java.util.Scanner;
class MinMax
{  
 public static void main(String args[])
 {
     int n, i,min,max,a[];
   
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = sc.nextInt();   
       a= new int[n];  
    System.out.println("Enter elements");  
    for ( i = 0; i < n; i++) ;
        {
            a[i] = sc.nextInt();
            System.out.println("Enter elements"); 
        }
       
          min=a[i];
    for(i=1;i<n;i++)
    {
        if(min>a[i])
        {
            min=a[i];
        }
         System.out.println("Min element is :" +min);
    }
     max=0;
     {
        for (i=0,i<n;i++)
        {
            a[i]=max;
        }
         if(a[i]>max)
            {
                max=a[i];
            }
             System.out.println("Max element is :" +max);
        }
        }
 }
 */

   import java.util.Scanner;
 class MinMax
{
    public static void main(String[] args) 
    {
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-1-i; j++) 
            {
                if (a[j] > a[j+1]) 
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n-1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
    