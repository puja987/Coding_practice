public class BSArr
{
    public static int binSerch(int []a,int key,int fst,int lst)
    {
        int mid=fst+(lst-fst)/2;
        if(fst<=lst)
        {
            if(key==a[mid])
            {
                return mid;
            }
            else if(key<a[mid])
            {
                return binSerch(a,key,fst,mid-1);
            }
            else
            {
                return binSerch(a,key,mid+1,lst);
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        int []a=new int[]{2,4,6,7,9,13};
        int index=binSerch(a,6,0,a.length-1);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found at : "+index);
        }
    }
}