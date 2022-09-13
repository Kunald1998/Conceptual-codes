import java.lang.*;

class Object
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Kunal",11000);
        System.out.println(eobj.toString());
    }
}
class Employee
{
    public String name;
    public int Salary;

    public Employee(String str,int no)
    {
        this.name = str;
        this.Salary = no;
    }

    public String toString()
    {
        return "Employee name is"+name"->""having salary"+Salary;
    }

}

    