//import java.lang.*;

class Demo
{
    public int i;
    public final int j =20; //he chalta
    public final int k;

    public Demo()
    {
        this.i = 10;
        this.k = 30; //only inside const.//he chalte
    }
    public Demo(int x, int y)
    {
        this.i = x;
        this.k = y;
    }

    public void fun()
    {
        i++;     //Allowed
        //j++;  //NA
        //k++;  //NA
    }
}


class Final
{
    public static void main(String arg[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);

        Demo obj2 = new Demo(11,21);
        obj2.fun();
        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);
    }
}

//OUTPUT
/*11
20
30
12
20
21*/