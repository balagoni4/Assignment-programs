import java.util.Scanner;

public class divide
{

	public static void main(String[] args) 
	{
		int number;
		
  	Scanner	sc = new Scanner(System.in);
		System.out.print("enter number ");
		number = sc.nextInt();	
		
		if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println(+ number + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println( + number + " is Not Divisible by 5 and 11"); 
		}	
	}
}