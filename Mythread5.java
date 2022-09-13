import java.lang.*;

class Mythread5
{
    public static void main(String arg[])throws Exception
    {
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1);  //New state creat zali
        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2);
        
        t1.start(); //Runnable state.

        t1.join(); //t1 la 1st priority bhetnar.
        
        t2.start();  //Runnable state.

        //Dead State ithe yate pan disat nahi.
    }
}

class Demo extends Thread
{
    public void run()  //Running State.//This is abstract method from thread class.
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("Value of i:"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception obj)
            {

            }
                
        }
    }
}

