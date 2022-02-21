import java.util.*;
class String6 
{
    public static void main(String args[])
    {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word");
      String str= sc.next();
        int vcount=0,ccount=0;
       String words[]=str.split(" ");
       
       for(int i=0;i<words.length;i++)
       {     
           for(int j=0;j<words[i].length();j++)
           {
               if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z' || words[i].charAt(j)>='a' && words[i].charAt(j)<='z' )
               {
                    
                    if(words[i].charAt(j)=='a' || words[i].charAt(j)=='e' || words[i].charAt(j)=='i' || words[i].charAt(j)=='o' || words[i].charAt(j)=='u')
                    {
                        vcount++;
                    }
                    else{
                        ccount++;
                    }
               }
           }
           System.out.println("No. of vowels in "+words[i]+" is : "+vcount);
           System.out.println("No. of Consonents in "+words[i]+" is : "+ccount);
           
             vcount=0;
             ccount=0;
       }
    }
}