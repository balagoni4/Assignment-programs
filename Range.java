import java.util.Scanner;
 class Range
{
	public static void main(String[] args)
	{
	                  int n,i=0,c=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range  : ");
		n = sc.nextInt();
		int count;
		for(0<=n ; n++)
		{
			c = 0;
			for( j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					c = c+1;
			}
			if(c == 2)
				System.out.println(i);
		}
	
	}
}
 