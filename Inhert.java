class vechile
{
    void wheels()
    {
        System.out.println("Two wheels");
    }
}
class  Bike extends vechile
{
    void brand1()
    {
        System.out.println("Bike brand Hero");
    }
}
class  MountainBike extends Bike
{
    void brand2()
    {
        System.out.println("MountainBike brand Drivebrave");
    }
}
class Inhert
{
    public static void main(String args[])
    Bike b=new bike();
    b.wheels();
     b.brand1();
      b.brand2();
}