import java.util.*;

class TreeNode{
  TreeNode left,right;
  int val;
  TreeNode(int val){
    this.val = val;
  }
}
class Check{
  boolean bal;
  int length;
  Check(int length, boolean bal){
    this.length = length;
    this.bal = bal;
  }
}



public class checkBalanced{
  static TreeNode root;

  public boolean balanced(TreeNode root){
    Check c = helper(root);
    return c.bal;
  }

  public Check helper(TreeNode n){
    if(n == null) return new Check(0,true);
    Check res1 = helper(n.left);
    Check res2 = helper(n.right);

    int lenA = res1.length;
    int lenB = res2.length;
    boolean fA = res1.bal;
    boolean fB = res2.bal;
    int len;
    if(lenA > lenB) len = lenA+1;
    else len = lenB+1;

    if(Math.abs(lenA - lenB) > 1 || !fA || !fB){
      return new Check(len,false);
    }

    return new Check(len,true);

  }
public static void main(String args[]){
  checkBalanced cb = new checkBalanced();
  root = new TreeNode(3);
  root.left = new TreeNode(1);
  root.right = new TreeNode(2);
  root.left.left = new TreeNode(5);
  root.right.left = new TreeNode(6);
  root.right.left.right = new TreeNode(4);

  System.out.println(cb.balanced(root));
}
}
