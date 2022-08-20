import java.util.*;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
public class InsrtSort
{
    public static void insrtionSort(int a[]) 
    {
        for(int i=0;i<a.length;i++)
        {
            int j=i-1;
            int b=a[i];
            while(j>=0 && b<=a[j])
            {
                a[j+1]=a[j];
                j-=1;
            }
            a[j+1]=b;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int []a=new int[]{3,7,1,9,4,2,6};
        insrtionSort(a);
    }
}