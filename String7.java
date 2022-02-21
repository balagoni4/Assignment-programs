import java.util.Scanner;

 class String7
 {
	public static void main(String[] args) 
	{
		String str;
		int i, a, d, s;
		a = d = s = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String ");
		str = sc.nextLine();
		
		for(i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				a++;
			}
			else if(ch >= '0' && ch <= '9') {
				d++;
			}
			else {
				s++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + a);
		System.out.println("Number of Digit Characters     =  " + d);
		System.out.println("Number of Special Characters   =  " + s);
	}
}