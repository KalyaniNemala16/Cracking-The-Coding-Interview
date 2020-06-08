class TreeNode{
TreeNode left,right;
TreeNode parent;
int val;
TreeNode(int val)
{
  this.val = val;
}
}
public class successor{
  static TreeNode root;
/*public static TreeNode nextNode(TreeNode n){
  if(n == null) return null;
  if(n.parent == null || n.parent.val < n.val){
    if((n.left == null && n.right == null) || (n.left!=null && n.right == null))
    return null;
    else if(n.left!=null && n.right!=null){
      TreeNode temp = n.right;
      while(temp.left != null){
        temp = temp.left;
      }
      return temp;
    }
  }
  else{
    if(n.right != null)
    return n.right;
  }
    return n.parent;
  }*/

  public static TreeNode nextNode(TreeNode n){
    if(n == null) return null;
    if(n.parent == null || n.parent.val < n.val){
      //if((n.left == null && n.right == null) || (n.left != null && n.right == null))
      if(n.right == null)
        return null;

      else{
        TreeNode t = n.right;
        while(t.left != null){
          t = t.left;
        }
        return t;
      }
    }
    if(n.parent.val > n.val){
      if(n.right != null){
        TreeNode t = n.right;
        while(t.left != null){
          t = t.left;
        }
        return t;
      }
      else return n.parent;
    }
    return n.parent;
    }

public static void main(String args[]){
successor s = new successor();
root = new TreeNode(4);
root.left = new TreeNode(2);
root.left.parent = root;
root.right = new TreeNode(6);
root.right.parent = root;
root.left.right = new TreeNode(3);
root.left.right.parent = root.left;
root.right.left = new TreeNode(5);
root.right.left.parent = root.right;
root.right.right = new TreeNode(8);
root.right.right.parent = root.right;

TreeNode node = nextNode(root.right.left);
if(node == null) System.out.print("No next node");
else
System.out.print(node.val);
//System.out.print(nextNode(root.right.right));

}
}
