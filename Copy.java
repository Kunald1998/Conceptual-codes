import java.lang.*;

class Copy
{
    public static void main(String arg[]) throws Exception
    {
        Employee eobj = new Employee(11,"Kunal",21000);
        System.out.println("EID:"+eobj.EID+"Name:"+eobj.Ename+"Salary:"+eobj.ESalary);

        Employee eobjx = (Employee)eobj.clone();
        System.out.println("EID:"+eobjx.EID+"Name:"+eobjx.Ename+"Salary:"+eobjx.ESalary);
        
        eobj.Ename = "Anurag";
        System.out.println("EID:"+eobjx.EID+"Name:"+eobjx.Ename+"Salary:"+eobjx.ESalary);
    }
}
class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int ESalary;

    public Employee(int id, String str,int no)
    {
        this.EID = id;
        this.Ename = str;
        this.ESalary = no;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

