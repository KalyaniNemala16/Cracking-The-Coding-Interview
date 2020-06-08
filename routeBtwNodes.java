import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class routeBtwNodes{
  public static  class Node{
    int val;
    boolean visited;
    ArrayList<Node> adj;
    public Node(){
      val = 0;
      visited = false;
      adj = new ArrayList<Node>();
    }
    public Node(int data){
      val = data;
      visited = false;
      adj = new ArrayList<Node>();
    }
  }
  public static void addneighbours(Node v , Node w){
    v.adj.add(w);
  }

  public static boolean dfs(Node s , Node d){
    Stack<Node> stack = new Stack<Node>();
    boolean flag1 = false; boolean flag2 = false;
    if(!s.visited){
      stack.push(s);
      s.visited = true;
      if(stack.peek() == d) return true;
      ListIterator<Node> itr = s.adj.listIterator();
      while(itr.hasNext()){
        Node n = itr.next();
        if(!n.visited){
          flag1 = dfs(n,d);
          if(flag1) flag2 = true;
        }
      }
    }
    return flag2;
  }

  public static boolean bfs(Node s , Node d){
    Queue<Node> q = new LinkedList<Node>();
    if(!s.visited)
    q.add(s);

    while(!q.isEmpty()){
      s = q.poll();
      if(s == d) return true;
      s.visited = true;
      ListIterator<Node> itr = s.adj.listIterator();
      while(itr.hasNext()){
        Node n = itr.next();
        if(!n.visited){
          q.add(n);
        }
      }
    }
    return false;
  }

  public static void main(String args[]){
    routeBtwNodes r = new routeBtwNodes();
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    r.addneighbours(n1,n2);
    r.addneighbours(n2,n5);
    r.addneighbours(n3,n1);
    r.addneighbours(n3,n4);
    r.addneighbours(n4,n2);
    r.addneighbours(n4,n5);
    r.addneighbours(n6,n4);

    boolean val1 = dfs(n3,n6);
    System.out.println("Using dfs:"+val1);

    n1.visited = false;
    n2.visited = false;
    n3.visited = false;
    n4.visited = false;
    n5.visited = false;
    n6.visited = false;

    boolean val2 = bfs(n3,n6);
    System.out.println("Using dfs:"+val2);


  }
}
