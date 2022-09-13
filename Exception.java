import java.util.*;

class Exception
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        System.out.println("Please enter first number:");
        int no1 = sobj.nextInt();

        System.out.println("Please enter second number:");
        int no2 = sobj.nextInt();

        int ans = no1 / no2;

        System.out.println("Division is:"+ans);


    }
}

/*
If we give the input as 10 and 0 then below error is occurs.

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception.main(Exception.java:15)

*/