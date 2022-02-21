 import java.util.*;
 class String8
{
    public static void main(String[] args)
    {
        String sen="",wd="",large="",small="";
        char ch=' ';
        int i=0,len=0,count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        sen = sc.nextLine();
        sen=sen+" ";
        large=Character.toString(sen.charAt(0));
        small=sen;
        len=sen.length();
        for(i=0;i< len;i++)
        {
            ch=sen.charAt(i);
            if(ch==' ')
            {
                if(wd.length()>large.length())
                {
                    large=wd;
                }
                if(wd.length()< small.length())
                {
                    small=wd;
                }

                wd="";
            }
            else
            {
                count++;
                wd=wd+ch;

            }
        }
        System.out.println("largest word:"+large);
        System.out.println("smallest word:"+small);

    }
}