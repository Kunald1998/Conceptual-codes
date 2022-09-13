import java.lang.*;

class Specificoop
{
    public static void main(String arg[])
    {
        Arithematic obj = new Arithematic(11,10);
        int ret = 0;
        ret = obj.Addition(10,11);
        System.out.println("Addition is:"+ret);
        

    }
}

class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic(int a, int b)
    {
        No1 = a;
        No2 = b;
    }

    public int Addition(int a,int b)
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}

