import java.util.Scanner;
class RangePal
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r1, r2,i,r;
        int a,b;
        
        System.out.println("Enter range ");
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        
        for ( i = r1; i <= r2; i++)
        {
            a = i;
            b= 0;
            while (a!= 0) {
                 r= a % 10;
                 b = b * 10 + r;
                a =a/ 10;
                
            }

            if (i == b)
                System.out.print(i + " ");
        }
    }
}