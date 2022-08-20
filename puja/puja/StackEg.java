import java.util.*;
public class StackEg
{
    public static void main(String []args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(9);
        s.push(4);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        // s.pop();
        // s.pop();
        boolean status=s.empty();
        System.out.println(status);
        int indfound=s.search(2);
        System.out.println(indfound);
        System.out.println(s.search(9));
        Iterator it=s.iterator();
        while(it.hasNext())
        {
            Object s2=it.next();
            System.out.print(s2);
        }
        System.out.println();
        System.out.println(s.size());
        s.sort(null);   //arrrange in asending order
        System.out.println(s);
    }
}
