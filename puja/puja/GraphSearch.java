import java.util.*;
public class GraphSearch
{
    int V;
    ArrayList<Integer> adjacency[];
    GraphSearch(int noOfVertex)
    {
        V=noOfVertex;
        adjacency=new ArrayList[noOfVertex];
        for(int i=0;i<noOfVertex;i++)
        {
            adjacency[i]=new ArrayList<>();        
        }
    }
    void edge(int x,int y)
    {
        adjacency[x].add(y);
    }
    void depthFirstSearch(int sourcevertex)
    {
        boolean[] visited=new boolean[V];
        Stack<Integer> s=new Stack<>();
        s.push(sourcevertex);
        int node;
        while(!s.empty())
        {
            sourcevertex=s.peek();
            s.pop();
            for(int i=0;i<adjacency[sourcevertex].size();i++)
            {
                node=adjacency[sourcevertex].get(i);
                if(!visited[node])
                {
                    s.push(node);
                }
            }
            if(visited[sourcevertex]==false)
            {
                System.out.print(sourcevertex+" ");
                visited[sourcevertex]=true;
            }
        }
    }
    void breathFirstSearch(int sourcevertex)
    {
        boolean[] visited=new boolean[V];
        ArrayList<Integer> a=new ArrayList<Integer>();
        visited[sourcevertex]=true;
        a.add(sourcevertex);
        while(!a.isEmpty())
        {
            sourcevertex=a.remove(0);
            System.out.print(sourcevertex+" ");
            Iterator i=adjacency[sourcevertex].iterator();
            while(i.hasNext())
            {
                int n=(int) i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    a.add(n);
                }
            }
        }
    }
    public static void main(String []args)
    {
        GraphSearch g=new GraphSearch(6);
        g.edge(0,1);
        g.edge(0,2);
        g.edge(0,5);
        g.edge(1,0);
        g.edge(1,2);
        g.edge(2,0);
        g.edge(2,1);
        g.edge(2,3);
        g.edge(2,4);
        g.edge(3,2);
        g.edge(4,2);
        g.edge(4,5);
        g.edge(5,0);
        g.edge(5,4);
        g.breathFirstSearch(0);
        System.out.println();
        g.depthFirstSearch(0);
    }
}