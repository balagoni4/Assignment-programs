import java.util.Scanner;

 class bill
{
    public static void main(String args[])
    {
        int units;
        double bill=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units consumed:");
        units=sc.nextInt();
        if(units<50)
        {
            bill=units*0.50;
        }
        else if(units<150)
        {
            bill=(50*0.50)+((units-100)*0.75);
        }
        else if(units<250)
        {
            bill=(50*0.50)+(50*0.75)+((units-150)*1.20);
        }
        else
        {
            bill=(50*0.50)+(50*0.75)*((units-200)*1.50);
        }
        System.out.println("the electricity bill for "+units+" is: "+ bill +"Rs");
    }
}