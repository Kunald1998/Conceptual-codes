import java.lang.*;
import java.util.*;

class Vector1
{
    public static void main(String arg[])
    {
        
        Vector <Integer>obj = new Vector <Integer>(12);

        obj.add(11);
        obj.add(21);
        obj.add(20);
        obj.add(51);
        obj.add(101);
        obj.add(110);
        obj.add(111);

        System.out.println("Capacity of vector is:"+obj.capacity());
        System.out.println("size of vector is:"+obj.size());

        for(int i = 0; i<obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }
        int i = 0, iCnt = 0;
        for(i=0; i<obj.size(); i++)
        {
            int no = obj.get(i);
            if(no%2 == 0)
            {
                iCnt++;
            }
        }
        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        obj.clear();


    }
}