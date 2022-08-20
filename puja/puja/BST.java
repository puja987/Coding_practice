import java.util.*;
class NodeEg
{
    char key;
    Node left, right;
    NodeEg(char key)
    {
        this.key=key;
    }

}
class BinarySolution
{
    Node root;
    void insertKey(char key)
    {
        root=insertInTree(root,key);
    }
    Node insertInTree(Node root,char key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
        {
            
            root.left=insertInTree(root.left,key);
        }
        else if(key>root.key)
        {
            root.right=insertInTree(root.right,key);
        }
        return root;
    }
    void preordertraversal(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }
}
public class BST
{
    public static void main(String []args)
    {
        BinarySolution t=new BinarySolution();
        t.insertKey('C');
        t.insertKey('I');
        t.insertKey('B');
        t.insertKey('G');
        t.insertKey('M');
        t.insertKey('A');
        t.preordertraversal(t.root);
    }
}
// }