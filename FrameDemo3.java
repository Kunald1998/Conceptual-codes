import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;
    public MarvellousFrame(String name)
    {
     fobj = new Frame(name);
     fobj.setSize(600,600);
     fobj.setVisible(true);  
     
     fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener implements WindowListener
{
    
}
class FrameDemo3
{
    public static void main(String Arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }

}