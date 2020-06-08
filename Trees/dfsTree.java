class Node{
Node left,right;
int val;
Node(int x){
  val = x;
  left = null;
  right = null;
}
}
public class dfsTree{
  static Node root;

  public void inorder(Node n){
    if(n == null) return;
    inorder(n.left);
    System.out.print(n.val);
    inorder(n.right);
  }
  public void preorder(Node n){
    if(n == null) return;
    System.out.print(n.val);
    preorder(n.left);
    preorder(n.right);
  }
  public void postorder(Node n){
  if(n == null) return;
  postorder(n.left);
  postorder(n.right);
  System.out.print(n.val);
  }

public static void main(String args[]){
  dfsTree d = new dfsTree();
  d.root = new Node(1);
  d.root.left = new Node(2);
  d.root.right = new Node(5);
  d.root.left.left = new Node(3);
  d.root.left.right = new Node(4);
  d.root.right.right = new Node(6);
  System.out.println("Inorder:");
  d.inorder(root);
  System.out.println();
  System.out.println("Preorder:");
  d.preorder(root);
  System.out.println();
  System.out.println("Postorder:");
  d.postorder(root);
}
}
