class QueueUsingArrray
{
    int front,rare,capacity;
    static int[] q;
    QueueUsingArrray(int size)
    {
        capacity=size;
        q=new int[capacity];
    }
    void enqueue(int value)
    {
        if(rare==capacity)
        {
            System.out.println("full");
        }
        else
        {
            q[rare]=value;
            rare++;
        }
    }
    void dequeue()
    {
        if(rare==0)
        {
            System.out.println("empty");
        }
        else{
            for(int i=0;i<rare-1;i++)//rare++
            {
                q[i]=q[i+1];
            }
            rare--;
        }
    }
    void display(){
        if(rare==0)
        {
            System.out.print("empty");
        }
        else{
            for(int i=0;i<rare;i++)
            {
            System.out.print(q[i]);
            }
        }
    }
}
public class Solution
{
    public static void main(String []args)
    {
        QueueUsingArrray q2=new QueueUsingArrray(5);
        q2.enqueue(2);
        q2.enqueue(8);
        q2.enqueue(4);
        q2.display();
        q2.dequeue();
        System.out.println();
        q2.display();
    }
}