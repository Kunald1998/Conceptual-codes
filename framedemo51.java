import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class FrameDemo51
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}

class Demo // backend class. yacha madhe apla logic yanar like addition cha logic.
{
        //button dablyavar kay action honara,kay print honar,te sarva ithe lihinar.
        //ya thikani scanner class cha object create karun input gheun addition karun return karu shakto.

        public String DataDe()  //user defined method ahe hi. Data de. 
        {
            return "Jay Ganesh...";
        }
}

class MarvellousFrame extends WindowAdapter implements ActionListener //front end class ahe ha.
{
    public Frame fobj; //frame cha nav PPA.
    public Button bobj; // button cha nav Marvellous,addition substraction etc.
    public TextField tobj; // print katayacha data addition of two numbers and other data.

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,170,20); 
        bobj.setBounds(110, 130,90,20); //button frame var x ani y distance var 60-60 ne thevla,ani button chi size 90/20 thvli..

        fobj.add(bobj); //frame var button add kela.
        fobj.add(tobj); //frame var text field add kela.

        fobj.setSize(600,600); //frame chi size set keli.
        fobj.setVisible(true); //frame dislipahijet mhnun true.
        fobj.setLayout(null); // 

        bobj.addActionListener(this); //button var action listnear add kela. button click kela ki kahi tari action hoil.
        fobj.addWindowListener(this);// window var kay action gheu shakto
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        Demo dobj = new Demo();
        String str = dobj.DataDe(); // str navacha variable ghetla ani.//str madhe DataDe method madhun Jay Ganesh return bhetel.
        tobj.setText(str);
    }
}

