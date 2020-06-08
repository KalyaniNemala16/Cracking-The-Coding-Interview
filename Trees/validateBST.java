import java.util.*;
import java.util.Arrays;
class TreeNode{
TreeNode left, right;
int val;
TreeNode(int x){
  val = x;
}
}
public class validateBST{
 static TreeNode root;
  public String helper(TreeNode n){
    if(n == null) return "";
    String s;
    s = helper(n.left) + String.valueOf(n.val) + helper(n.right);
    return s;
  }
  public boolean validate(TreeNode root){
    String s = helper(root);
    if(s.isEmpty()){
      return false;
    }
    int[] arr = new int[s.length()];
    for(int i = 0 ; i<s.length() ; i++){
      arr[i] = s.charAt(i);
    }
    for(int i = 0; i<arr.length-1; i++){
      if(arr[i] > arr[i+1]) return false;
    }
    return true;
  }
  public static void main(String args[]){
    validateBST v = new validateBST();
    root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    //System.out.print(v.helper(root));

    System.out.print(v.validate(root));
  }
}
