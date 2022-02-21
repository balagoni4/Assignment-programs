import java.io.*;
class Buffer
{
    
    public static void main(String args[])throws IOException
    {
        int eno;
        String ename;
        float esal;
        
        InputStreamReader in=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(in);
         
         System.out.println("Enter employee number");
         eno=Integer.parseInt(br.readLine());
          System.out.println("Enter employee name");
         ename=br.readLine();
          System.out.println("Enter employee salary");
         esal=Float.parseFloat(br.readLine());
         
         System.out.println("employee number is :"+eno);
         System.out.println(" employee name  is:"+ename);
         System.out.println(" employee salary is :"+esal);
    }
}