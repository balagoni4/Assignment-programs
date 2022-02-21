import java.util.Scanner;

 class String3
{
	public static void main(String[] args)
	{
		String st1Words;
		int i, totalWords;
		totalWords = 1;
		char ch;
		
	Scanner sc= new Scanner(System.in);

		System.out.print("Please Enter String  ");
	st1Words = sc.nextLine();
		
		for(i = 0; i <st1Words.length(); i++)
		{
			ch =st1Words .charAt(i);
			if((ch == ' ' ) || ch == '\t')
			{
				totalWords++;
			}
		}		
		System.out.println("\nTotal Number of Words  =  " + totalWords);
	}
}