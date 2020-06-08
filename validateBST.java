public class validateBST{
  public static class Node{
    int val;
    Node left,right;
    public Node(int data){
      val = data;
      left = null;
      right = null;
    }
  }

  public static boolean validate(Node root,Integer min,Integer max){
    if(root == null) return true;
    if(max!=null && root.val>max || min!=null && root.val<=min){
      return false;
    }
    if(!validate(root.left,min,root.val) || !validate(root.right,root.val,max)){
      return false;
    }
    return true;
  }

  public static boolean validate(Node n){
    boolean result = validate(n,null,null);
    return result;
  }

  public static void main(String args[]){
    validateBST v = new validateBST();
    Node n1 = new Node(1);
    n1.left = new Node(2);
    n1.left.left = new Node(4);
    n1.left.right = new Node(0);
    n1.left.right.left = new Node(6);
    n1.left.right.left.right = new Node(7);
    n1.right = new Node(3);
    n1.right.left = new Node(8);
    n1.right.right = new Node(9);
    System.out.println(v.validate(n1));
  }

}
