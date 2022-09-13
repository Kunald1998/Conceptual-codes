import java.lang.*;

interface Circle
{
    public static final float PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumference(float Radius);
}

class Area implements Circle
{
    public float CalculateArea(float Radius)
    {
        return (PI*Radius*Radius);
    }
    public float CalculateCircumference(float Radius)
    {
        return (2*PI*Radius);
    }
}

class Kunal
{
    public static void main(String arg[])
    {
        System.out.println("Value of PI is:"+Circle.PI);
        //Circle.PI = 6.14f;
        Area obj = new Area();
        float fRet = 0.0f;

        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is:"+fRet);

        fRet = obj.CalculateCircumference(10.5f);
        System.out.println("Circumference is:"+fRet);


    }
}