import java.lang.*;


abstract class Demo
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside demo fun");
    }

    public abstract void gun();
}

class Hello extends Demo
{
    public int x,y;

    public void gun()
    {
        System.out.println("Inside the hello gun");
    }
}

class Abstract
{
    public static void main(String arg[])
    {
        Hello hobj = new Hello();

        hobj.fun();
        hobj.gun();
    }
}

