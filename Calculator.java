import java.lang.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

class Calculator
{
    public static void main(String arg[])
    {
        MarvellousWindow mobj = new MarvellousWindow("Calculator");
    }
}
class Demo
{
    public int Data()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int A = sobj.nextInt();
        System.out.println("Enter the Second number:");
        int B = sobj.nextInt();

        int C = A + B;
        return C;
    }
}
class MarvellousWindow extends WindowAdapter implements ActionListener 
{
    public Frame fobj;
    public Button bobj1;
    public Button bobj2;
    public TextField tobj;

    public MarvellousWindow(String name)
    {
        fobj = new Frame(name);
        bobj1 = new Button("Addition");
        bobj2 = new Button("Substraction");
        tobj = new TextField();

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        tobj.setBounds(60,60,60,50);
        bobj1.setBounds(100,110,80,30);

        fobj.add(bobj1);
        fobj.add(tobj);

        fobj.addWindowListener(this);
        bobj1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent obj)
    {
        Demo dobj = new Demo();
        int Ans = dobj.Data(); 
        tobj.setText(Integer.toString(Ans));
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}


