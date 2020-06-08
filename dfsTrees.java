public class dfsTrees{
  public static Node root;
  public static class Node {
    Node left,right;
    int val;
    Node(int data){
      val = data;
      left = null;
      right = null;
    }
  }
  public static void postOrder(Node temp){
    if(temp!=null){
      postOrder(temp.left);
      postOrder(temp.right);
      System.out.println(temp.val);
    }
  }
  public static void inOrder(Node temp){
    if(temp!=null){
      inOrder(temp.left);
      System.out.println(temp.val);
      inOrder(temp.right);
    }
  }

  public static void preOrder(Node temp){
    if(temp!=null){
      System.out.println(temp.val);
      preOrder(temp.left);
      preOrder(temp.right);
    }
  }
  public static void dfs(){
    System.out.println("Using postorder:");
    postOrder(root);
    System.out.println("Using inorder:");
    inOrder(root);
    System.out.println("Using preorder:");
    preOrder(root);
  }
  public static void main(String args[]){
    dfsTrees d = new dfsTrees();
    d.root = new Node(1);
    d.root.left = new Node(2);
    d.root.left.left = new Node(4);
    d.root.right = new Node(3);
    d.root.right.left = new Node(5);
    d.root.right.right = new Node(6);

    d.dfs();
  }
}
