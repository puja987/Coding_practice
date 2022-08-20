 import java.util.*;
 public class HashEg 
 {
    public static void main(String []args)
    {
        String a="Hello";
        System.out.println(a.hashCode());
        Hashtable<String,Integer> student=new Hashtable<String,Integer>();
        // HashMap<String,Integer> student=new HashMap<String,Integer>();
        student.put("priya",3);
        student.put("Puja",2);
        student.put("Rohit",7);
        Set<String> data=student.keySet();
        for(String i:data)
        {
            System.out.println(student.get(i));
            System.out.println(i.hashCode());
        }
        Set<Map.Entry<String,Integer>> data1=student.entrySet();
        for(Map.Entry<String,Integer> i:data1)
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
 }