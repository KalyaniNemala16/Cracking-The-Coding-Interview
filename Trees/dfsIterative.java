import java.util.*;
class TreeNode{
TreeNode left,right;
int val;
TreeNode(int x){
val = x;
}
}
public class dfsIterative{
  static TreeNode root;
  public void dfs(TreeNode root){
    if(root!=null) {
      Stack<TreeNode> s = new Stack<TreeNode>();
      s.push(root);
      while(!s.isEmpty()){
        TreeNode n = s.pop();
        System.out.print(n.val);
        if(n.right!=null) s.push(n.right);
        if(n.left!=null) s.push(n.left);
      }
    }
  }
public static void main(String args[]){
  dfsIterative d = new dfsIterative();
  root = new TreeNode(3);
  root.left = new TreeNode(2);
  root.right = new TreeNode(5);
  root.left.left = new TreeNode(1);
  root.right.left = new TreeNode(4);
  root.right.right = new TreeNode(6);

  d.dfs(root);
}
}
