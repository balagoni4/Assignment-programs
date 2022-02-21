import java.util.Scanner;

class scannner
{
    public static void main(String args[])
    {
        int pno;
        String pname;
        float pcost,pqty;
        float bill;
        
        
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter product number");
        pno=sc.nextInt();
          System.out.println("Enter product name");
        pname=sc.next();
         System.out.println("Enter product cost");
        pcost=sc.nextFloat();
         System.out.println("Enter product quantity");
        pqty=sc.nextFloat();
        
      
         System.out.println("The given product number is"+pno);
          System.out.println("The given product name is"+pno);
           System.out.println("The given product cost is"+pcost);
            System.out.println("The given product quantity is"+pqty);
            
             float Tbill=(pqty*pcost);
             System.out.println("The total bill is-"+Tbill);
    }
}