//import java.lang.*;
class Base
{
    public int fun(int i,int j)
    {
        System.out.println("Inside base fun with 2 arguments");
        return i+j;
    }

    public int fun(int i, int j, int k)
    {
        System.out.println("Inside base fun with 3 arguments");
        return i+j+k;
    }
    public int fun(int i, int j,int k,int l)
    {
        System.out.println("Inside base fun with 4 arguments");
        return i+j+k+l;
    }    

}
class Overloading
{
    public static void main(String arr[])
    {
        Base obj = new Base();
        int ret = 0;
        ret = obj.fun(10,20);
        System.out.println(ret);
        ret = obj.fun(10,20,30);
        System.out.println(ret);
        ret = obj.fun(10,20,30,40);
        System.out.println(ret);

        
    }
}