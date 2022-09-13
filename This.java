import java.lang.*;

class This
{
    public static void main(String arg[])
    {
        Demo dobj1 = new Demo(216,"Kunal",60.31f);
        Demo dobj2 = new Demo(215,"Anurag",92.51f);

        dobj1.display();
        dobj2.display();
        
    }
}
class Demo
{
    int RollNo;
    String Name;
    float Marks;

    public Demo(int RollNo,String Name, float Marks)
    {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Marks = Marks;
    }

    public void display()
    {
        System.out.println("Roll number is:"+RollNo);
        System.out.println("name is is:"+Name);
        System.out.println("marks is:"+Marks);


    }
}
