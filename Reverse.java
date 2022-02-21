import java.util.Scanner;

class Reverse
{
    public static void main(String args[])
    { 
        int n,r=0,t;
        
         Scanner sc=new Scanner(System.in);
         System.out.println("enter any value");
         n=sc.nextInt();
         t=n;
         for (;n>0;)
         {
             r=n%10;
             r=r*10+r;
             n=n/10;
         }
         System.out.println(r);
    }
}

/*
1) To Print Range of the Palindrome Number
2) To Print Range of the Armstrong Number
3) Fibonacci Series for N terms
n=8
0 1 1 2 3 5 8 13
*/