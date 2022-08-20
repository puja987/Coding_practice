import java.util.*;
class Node
{
    char key;
    Node left,right;
    Node(char key)
    {
        this.key=key;
    }
}
class TreeTraversal
{
    Node root;
    void preordertraversal(Node n)
    {
        if(n!=null)
        {
            System.out.print(n.key+" ");
            preordertraversal(n.left);
            preordertraversal(n.right);
        }
    }
    void inordertraversal(Node n)
    {
        if(n!=null)
        {
            preordertraversal(n.left);
            System.out.print(n.key+" ");
            preordertraversal(n.right);
        }
    }
    void postordertraversal(Node n)
    {
        preordertraversal(n.left);
        preordertraversal(n.right);
        System.out.print(n.key+" ");
    }
}
class Traversal
{
    public static void main(String []args)
    {
        TreeTraversal t=new TreeTraversal();
        t.root=new Node('A');
        t.root.left=new Node('B');
        t.root.right=new Node('C');
        t.root.left.left=new Node('D');
        t.root.left.right=new Node('E');
        t.preordertraversal(t.root);
        System.out.println();
        t.inordertraversal(t.root);
        System.out.println();
        t.postordertraversal(t.root);
    }
}