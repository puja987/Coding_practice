import java.util.*;
public class SelSort
{
    public static void selSortArr(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            int intmed=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[intmed])
                {
                    intmed=j;
                }
            }
            int swap=a[i];
            a[i]=a[intmed];
            a[intmed]=swap;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]=new int[]{3,7,8,2,1,9,4};
        selSortArr(a);
    }
}