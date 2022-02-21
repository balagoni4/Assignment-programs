import java.util.Scanner;

class student
{
    public static void main(String args[])
    {
        int studentid;
        String studentname;
        float maths;
         float science;
          float social;
          float totalmarks,average;
         
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter student id");
        studentid=sc.nextInt();
          System.out.println("Enter student name");
        studentname=sc.next();
         System.out.println("Enter maths marks");
        maths=sc.nextFloat();
         System.out.println("Enter science marks");
        science=sc.nextFloat();
         System.out.println("Enter social marks");
        social=sc.nextFloat();
        
        totalmarks=(maths+science+social);
        average=((maths+science+social)/3);
        
         System.out.println("The total marks of student is:"+totalmarks);
          System.out.println("The average marks of the student is :"+average);
    }
}