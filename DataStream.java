import java.io.*;
class DataStream
{
    
    public static void main(String args[])throws Exception
    {
        int eno;
        String ename;
        float esal;
        
        DataInputStream br=new DataInputStream(System.in);
        
         System.out.println("Enter employee number");
         eno=Integer.parseInt(br.readLine());
          System.out.println("Enter employee name");
         ename=br.readLine();
          System.out.println("Enter employee salary");
         esal=Float.parseFloat(br.readLine());
         
         System.out.println("Employee number is :" + eno);
         System.out.println(" Employee name  is:" + ename);
         System.out.println(" Employee salary is :" + esal);
    }
}