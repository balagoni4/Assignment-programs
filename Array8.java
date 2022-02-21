import java.util.Scanner;
 class Array8
 {
public static void main (String[] args)
{
    int n;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }

    for(int i=0; i<a.length; i++)
    {
        boolean isPrime = true;


        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
     

        if(isPrime)

            System.out.println(i + " are the prime numbers in the array ");
    }
}
}