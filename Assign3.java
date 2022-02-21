import java.util.Scanner;
 class Assign3
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
        for (int i = 0; i < n; i++) 
        {
            for (int j = i +1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    t = a[i];
                    a[j] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}