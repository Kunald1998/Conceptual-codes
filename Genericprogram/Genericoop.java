import java.lang.*;

class Specificoop
{
    public static void main(String arg[])
    {
        Arithematic<Integer> obj = new Arithematic<Integer>(11,10);
        int ret = 0;
        ret = obj.Addition(10,11);
        System.out.println("Addition is:"+ret);
        

    }
}

class Arithematic<T>
{
    public T No1;
    public T No2;

    public Arithematic(T a, T b)
    {
        No1 = a;
        No2 = b;
    }

    public int Addition(T a,T b)
    {
        if((No1 instanceof Integer) && (No2 instanceof Integer))
        {
            return (T)(Integer)((Integer)No1 + (Integer)No2);
        }
        else if((No1 instanceof Float)&&(No2 instanceof Float))
        {
            return (T)(Float)((Float)No1 + (Float)No2);
        }
        else if((No1 instanceof Double)&&(No2 instanceof Double))
        {
            return (T)(Double)((Double)No1 + (Double)No2);
        }
       else
       {
           return null;
       } 
    }
}

