import java.lang.*;

final class Base
{
    public int i;
    public  int j;

    public Base() 
    {
        System.out.println("Inside base constructor"); 
         
    }

    public  void fun()
    {
        System.out.println("Inside base fun");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }
}

class Derived 
{
    public int x;
    public int y;

    Base bobj = new Base();
    
    public void sun()
    {
        System.out.println("Inside Derived sun");
        
    }
    public  void run()
    {
        System.out.println("Inside Derived run");
        
    }
}
class Inheritance
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.sun();
        dobj.bobj.fun();
        
        
    }
}