class TreeNode{
  TreeNode left,right;
  int val;
  TreeNode(int x){
    val = x;
  }
}
public class validateBST2{
  static TreeNode root;
  public boolean helper(TreeNode n , boolean flag){
    if(n == null) return true;
    flag = helper(n.left,flag);
    flag = helper(n.right,flag);
    if(n.left!=null && n.right!=null){
      if(n.left.val>n.val || n.right.val<n.val || !flag)
      return false;
    }
    else if(n.left!=null && n.right == null){
      if(n.left.val > n.val || !flag)
      return false;
    }
    else{
      if(n.right.val < n.val || !flag)
      return false;
    }
    return true;
  }
  public boolean validate(TreeNode root){
    boolean flag = true;
    return helper(root,flag)
  }
  public static void main(String args[]){
    validateBST2 v = new validateBST2();
    root = new TreeNode(3);
    root.left = new TreeNode(4);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    root.right.right = new TreeNode(6);

    System.out.println(v.validate(root));
  }

}
