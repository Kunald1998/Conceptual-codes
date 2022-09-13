
import java.util.*;

class Input
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sobj.nextLine();

        System.out.println("Please enter your age");
        int Age = sobj.nextInt();

        System.out.println("Please enter your Percentage");
        float Percentage = sobj.nextFloat();

        System.out.println("Your name is:"+name);
        System.out.println("Your age :"+Age);
        System.out.println("Your Percentage is:"+Percentage);
        sobj.close(); ////this is like deallowcaet 

    }
}
