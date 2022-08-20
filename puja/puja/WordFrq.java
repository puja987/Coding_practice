import java.util.*;
public class WordFrq
{
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
    String word=sc.nextLine();
    System.out.println(RetFrq(string,word));
    }
    public static int RetFrq(String string,String word)
    {
        int c=0;
        String []str=string.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==word)
            {
                c+=1;
            }
        }
        return c;
    }
}
