import java.lang.*;
import java.util.*;

class LL//Linked List
{
    public static void main(String arg[])
    {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Januay");
        obj.add("February");
        obj.add("March");
        obj.add("Marvellous");
        obj.add(2,"New");
        obj.add("April");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("May");

        System.out.println("Arraylist contain:"+obj); //janury , february 

        System.out.println("Size is:"+obj.size()); //2
        System.out.println("Array contains:"+obj);

        for(int i = 0; i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
        String str;
        int Cnt = 0;
        for(int i = 0; i<obj.size(); i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"))
            {
                Cnt++;
            }
        }
        System.out.println("Elements at index ");

        if(obj.contains("Januuary"));
        {
            System.out.println("Element is there");
        }

        int ret = obj.indexOf("February");
        System.out.println("Elements is at:"+ret);

        System.out.println("Elements at index 3 is:"+obj.get(3));
        obj.remove(2);
        obj.remove("April");
        System.out.println("Updated list is:"+obj);

        Iterator iobj = obj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }


        obj.clear();
        System.out.println("Update list is:"+obj);

    }
}