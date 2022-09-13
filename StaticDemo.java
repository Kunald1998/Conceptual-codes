
//import java.lang.*;

class Demo
{
    public int i;
    public int j;
    public static int k;

    public Demo()
    {
        System.out.println("Inside the defaullt constructor");
        this.i = 0;
        this.j = 0;
    }

    static
    {
        System.out.println("Inside the static block");
        k = 11;
    }

    public void fun()
    {
        System.out.println("Inside the non static fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(k);
    }

    public static void gun()
    {
        System.out.println("Inside the static gun");
        //System.out.println(this.i);
        //System.out.println(this.j);
        System.out.println(k);
    }
}

class StaticDemo
{
    public static void main(String arr[])
    {

    Demo.gun();
    
    Demo obj = new Demo();

    obj.fun();
    System.out.println(obj.i);
    System.out.println(obj.j);
    System.out.println(Demo.k);

    //obj.gun();
    }
}