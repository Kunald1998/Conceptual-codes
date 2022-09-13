import java.lang.*;

class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Enter first number is:" +Arg[0]);
        System.out.println("Enter first number is:" +Arg[1]);

        int ans = Integer.parseInt(Arg[0]) + Integer.parseInt(Arg[1]);
        System.out.println("Addition is:"+ans);
    }
}

// To run the above code use below command 
// javac Command.java 
// java Command 10_11 