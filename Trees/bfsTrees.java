import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class bfsTrees{
  public static Node root;
  public static Queue<Node> queue = new LinkedList<>();
  public static class Node {
    Node left,right;
    int val;
    Node(int data){
      left = null;
      right = null;
      val = data;
    }
  }
  public static void bfs(){
    Node temp = root;
    queue.add(temp);
    while(!queue.isEmpty()){
      temp = queue.poll();
      System.out.println(temp.val);
      if(temp.left!=null)
      queue.add(temp.left);
      if(temp.right!=null)
      queue.add(temp.right);
    }
  }
  public static void main(String args[]){
    bfsTrees b = new bfsTrees();
    b.root = new Node(1);
    b.root.left = new Node(2);
    b.root.left.left = new Node(4);
    b.root.right = new Node(3);
    b.root.right.left = new Node(5);
    b.root.right.right = new Node(6);

    b.bfs();
  }
}
