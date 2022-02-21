import java.util.Scanner;
class calculator
{
    public static void main(String[] args)
    {
        int a,b,c,ch;
        Scanner sc=new Scanner(System.in);
       System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
         System.out.println("3.MULTIPLICATION");
          System.out.println("4.DIVISION");
           System.out.println("5.REMINDER");
           
            System.out.println("Enter your choice");
           ch=sc.nextInt();
           
            System.out.println("Enter a value");
         a=sc.nextInt();
          System.out.println("Enter b value");
         b=sc.nextInt();
          switch(ch)
         {
             case 1 :
               c=a+b;
                System.out.println("The addition value is :" +c);
            break;
             case 2 :
               c=a-b;
                System.out.println("The addition value is :" +c);
            break;
             case 3 :
               c=a*b;
                System.out.println("The multiplication value is :" +c);
            break;
             case 4 :
               c=a/b;
                System.out.println("The division value is :" +c);
            break;
             case 5 :
               c=a%b;
                System.out.println("The addition value is :" +c);
            break;
             default:
            System.out.println("please enter correct option");
         }
    }
}
            