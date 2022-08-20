//import java.util.*;
public class CirLList {
    Node head,tail;
   static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }
    void insertElements(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    void disEle()
    {
        Node n1=head;
        if(tail==null && head==null)
        {
            System.out.println("empty");
        }
        else {
            do{
                System.out.println(n1.data);
                n1=n1.next;
            }
            while(n1!=head);
        }
    }
    public static void main(String []args)
    {
        CirLList l=new CirLList();
        l.insertElements(2);
        l.insertElements(9);
        l.insertElements(4);
        l.disEle();
    }
}
