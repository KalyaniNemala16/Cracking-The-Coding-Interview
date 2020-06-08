import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.ListIterator;

public class dfsGraph1{

  public static class Node{
    int val;
    ArrayList<Node> adj;
    boolean vis;

    public Node(int data){
      val = data;
      adj = new ArrayList<Node>();
      vis = false;

    }
    public Node(){
      val = 0;
      adj = new ArrayList<Node>();
      vis = false;

    }
  }

 public static void addneighbours(Node v,Node w){
   v.adj.add(w);
 }

  public static void dfs(Node s){
    Stack<Node> stack = new Stack<Node>();
    stack.push(s);
    while(!stack.isEmpty()){
      Node n = stack.pop();
      if(!n.vis)
      System.out.println(n.val);
      n.vis = true;
      ListIterator<Node> itr = n.adj.listIterator();
      while(itr.hasNext()){
        Node new_node = itr.next();
        boolean flag = new_node.vis;
        if(!flag){
          stack.push(new_node);
        }
      }
    }
  }



  public static void main(String args[]){
    dfsGraph1 df = new dfsGraph1();
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);

    df.addneighbours(n1,n2);
    //df.addneighbours(n1,n3);
    //df.addneighbours(n2,n4);
    df.addneighbours(n3,n1);
    df.addneighbours(n3,n4);
    df.addneighbours(n2,n5);
    df.addneighbours(n4,n2);
    df.addneighbours(n4,n5);
    df.addneighbours(n6,n4);


    dfs(n1);
    dfs(n2);
    dfs(n3);
    dfs(n4);
    dfs(n5);
    dfs(n6);


  }
}
