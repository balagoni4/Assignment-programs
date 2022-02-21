import java.util.Scanner;
class salaries
{
 public static void main(String args[]) 
 {
     
  float salary,DA,HRA,d,h,Grosspayment;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Salary Of Employee: ");
  salary=sc.nextFloat();
  System.out.println("Enter DA Of Employee: "); 
  d=scan.nextFloat();
  System.out.println("Enter HRA Of Employee: ");
  h=sc.nextFloat();
  
  DA=(d*salary)/100;
  HRA=(h*salary)/100;
  Grosspayment=salary+DA+HRA;
  
  System.out.println("Gross Salary Of Employee: "+Grosspayment);
  }
}