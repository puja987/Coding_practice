import java.util.*;
public class HelloW
{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        int i=0,j=1,l;
        System.out.print(i+" "+j+" ");
        int n=10;
        // int n=sc.nextInt();
        int sum=0;
        for(int k=2;k<n;++k)
        {
            l=i+j;
            sum=l;
            System.out.print(sum+" ");
            i=j;
            j=l;
        }
    }
}