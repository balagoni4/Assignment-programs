class vechile
{
    int wheels;
    String color;
    void wheel()
    {
        System.out.println(wheels + color);
    }
}
class  car extends vechile
{
    int speed;
    void speed1()
    {
        System.out.println(speed);
    }
}
class  Truck extends vechile
{
    int load;
    void load1()
    {
        System.out.println(load);
    }
}
class  Electric extends car
{   
    int charge;
    void charging()
    {
        System.out.println(charge);
    }
}
class  petrol extends car
{
    int cap;
    void capacity()
    {
        System.out.println(cap);
    }
}
class vechile1
{
    public static void main(String args[])
    {
    car a = new car();
     vechile vc = new vechile();
      Truck b = new Truck();
       Electric c = new Electric();
         petrol d = new petrol();
    vc.wheels=4;
    vc.color=red;
    vc.wheel();
    d.cap=100;
    c.charge=20;
    b.load=500;
    
    a.speed1();
    b.load1();
    c.charging();
    d.capacity();
   
}
}