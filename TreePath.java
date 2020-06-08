import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TreePath{
  public static Node root;
  public static boolean flag;
  public static Stack<Integer> stack = new Stack<Integer>();
  public static class Node{
    Node left,right;
    int val;
    Node(int data){
      val = data;
      left = null;
      right = null;
    }
  }
  public static Stack<Integer> PostOrder(Node temp, int target){
    if(temp!=null && !flag){
      stack = PostOrder(temp.left,target);
      stack = PostOrder(temp.right,target);
      if(temp.val == target || !stack.isEmpty() && !flag){
        stack.push(temp.val);
        if(temp == root)
        flag = true;
      }
    }
    return stack;
  }
  public static void print(int k){
    Stack<Integer> s = PostOrder(root,k);
    if(s.isEmpty())
    System.out.println("Element not found in tree");
    else{
      System.out.println("Path to the elemnt in tree is found : ");
      while(!s.isEmpty()){
        System.out.println(s.pop());
      }
    }

  }
  public static void main(String args[]){
    TreePath path = new TreePath();
    path.root = new Node(1);
    path.root.left = new Node(2);
    path.root.left.left = new Node(4);
    path.root.right = new Node(3);
    path.root.right.left = new Node(5);
    path.root.right.right = new Node(6);
    int k = 5;
    path.print(k);
  }
}
