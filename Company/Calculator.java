import Company.Addition;
import Company.Substraction;
import Company.Multiplication;


class Calculator
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Addition aobj = new Addition();
        Substraction sobj = new Substraction();
        Multiplication mobj = new Multiplication();

        iRet = aobj.Add(10,20);
        System.out.println(iRet); //30
        iRet = sobj.Sub(60,20);
        System.out.println(iRet);  //40
        iRet = mobj.Mult(5,3);
        System.out.println(iRet);  //15
    }
}