import java.util.Scanner;
 class String10
{
    public static void main(String[] args)
    {
        String sen="",wd="",wd1="";
        char ch=' ',lastCharacter=' ';
        int i=0,len=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        sen = sc.nextLine();
        sen=sen+" ";
        len=sen.length();
        System.out.println("Palindrome words in string:");

        for(i=0;i< len;i++)
        {
            ch=sen.charAt(i);
            if(ch==' ')
            {

                if(wd.equalsIgnoreCase(wd1)==true)
                {
                    System.out.println(wd);
                }
                wd1="";
                wd="";

            }
            else
            {
                wd=wd+ch;
                wd1=ch+wd1;
            }
        }

    }
}