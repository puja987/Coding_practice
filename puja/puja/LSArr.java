import java.util.*;
public class LSArr
{
    public static void main(String []args)
    {
        int a[]=new int[]{6,4,5,8,2,1,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                System.out.println("index= "+i);
                c++;
            }
            
        }
        if(c==0)
        {
            System.out.println("not found");
        } 
    }
}