import java.util.Scanner;
class Array10
{
        public static void main(String[] args)
        {
                int i,n;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];

    System.out.println("Enter the elements of the array: ");
    for(i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
                int max = a[0];
                int secondmax = a[0];
                int min = a[0];
                int secondmin = a[0];

                System.out.println("The given array is:" );
                for ( i = 0; i < a.length; i++)
                {
                        System.out.print(a[i]+" ");
                }
                System.out.println("\n              " );
                for ( i = 0; i < a.length; i++)
                {
                        if (a[i] > max)
                        {
                                secondmax = max;
                                max = a[i];
                        }
                        else if (a[i] > secondmax)
                        {
                                secondmax = a[i];
                        }
                }
                for ( i = 0; i < a.length; i++)
                {
                        if (a[i] < min)
                        {
                                secondmin = min;
                                min = a[i];
                        }
                        else if (a[i] < secondmin)
                        {
                                secondmin = a[i];
                        }
                }
                System.out.println("\nSecond maximum number is: " + secondmax);
                System.out.println("\nSecond minimum number is: " + secondmin);
        }
}