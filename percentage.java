
import java.util.Scanner;

 class percentage 
{
    public static void main(String[] args) 
    {
        float physics,chemistry,biology, maths,computer;
        float total;
        float average;
        float percentage;
        char grade;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter physics marks");
         physics=sc.nextFloat();
         System.out.println("Enter chemistry marks");
         chemistry=sc.nextFloat();
         System.out.println("Enter biology marks");
         biology=sc.nextFloat();
         System.out.println("Enter maths marks");
         maths=sc.nextFloat();
         System.out.println("Enter computer marks");
         computer=sc.nextFloat();

        
        total=physics+chemistry+biology+maths+computer;
        average=(total/5);
        percentage=((total/500)*100);
        
        if (average >= 90)
            grade = 'A';
        else if (average>=80 && average<90)
            grade = 'B';
        else if (average>=70 && average<80)
            grade = 'C';
        else if (average>=60 && average<70)
            grade = 'D';
        else if(average>=40 && average<50)
            grade = 'E';
        else
            grade='F';
            
        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}