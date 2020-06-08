import java.util.*;

class Node{
  int val;
  boolean vis;
  ArrayList<Node> adj;
  Node(int val){
    this.val = val;
    vis = false;
    adj = new ArrayList<Node>();
  }
  Node(){
    val = 0;
    vis = false;
    adj = new ArrayList<Node>();
  }
}
public class RouteNodes{
  public void add(Node v,Node w){
    v.adj.add(w);
  }
  public boolean helper(Node root,Node target, boolean flag){
  if(!root.vis){
    root.vis = true;
    if(root == target) return true;
    Iterator<Node> itr = root.adj.iterator();
    while(itr.hasNext()){
      flag = helper(itr.next(),target,flag);
    }
  }
  return flag;
  }
  public boolean check(Node root,Node target){
    boolean flag = false;
    return helper(root,target,flag);
  }
  public static void main(String args[]){
    RouteNodes r = new RouteNodes();
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    r.add(n1,n4);
    r.add(n2,n3);
    r.add(n3,n2);
    r.add(n3,n4);
    r.add(n4,n1);
    r.add(n5,n3);

    //System.out.println(r.check(n1,n5));
    System.out.println(r.check(n5,n1));

  }
}
