import java.util.Scanner;

class celsius
{
    public static void main(String args[])
    {
        float fahrenheit;
        float celsius;
        
         
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter temperature in fahrenheit");
        fahrenheit=sc.nextFloat();
        
        celsius=((fahrenheit-32)*5/9);
        
         System.out.println("The temperature in terms of celsius is:"+celsius);
    }
}