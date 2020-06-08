import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;

public class bfsGraph{
  public static class Node{
    int val;
    boolean vis;
    ArrayList<Node> adj;
    public Node(){
      val = 0;
      vis = false;
      adj = new ArrayList<Node>();
    }
    public Node(int data){
      val = data;
      vis = false;
      adj = new ArrayList<Node>();
    }
  }
  public static void addneighbours(Node v, Node w){
    v.adj.add(w);
  }
  public static void bfs(Node s){
    Queue<Node> q = new LinkedList<Node>();
    q.add(s);
    while(!q.isEmpty()){
      Node n = q.poll();
      System.out.println(n.val);
      n.vis = true;
      ListIterator<Node> itr = n.adj.listIterator();
      while(itr.hasNext()){
        Node new_node = itr.next();
        boolean flag = new_node.vis;
        if(!flag)
        {q.add(new_node);}
        new_node.vis = true;
      }
    }
  }

  public static void main(String args[]){
    bfsGraph b = new bfsGraph();
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    b.addneighbours(n1,n2);
    b.addneighbours(n1,n3);
    b.addneighbours(n2,n4);
    b.addneighbours(n2,n5);
    b.addneighbours(n4,n3);
    b.addneighbours(n4,n5);

    b.bfs(n1);
  }
}
