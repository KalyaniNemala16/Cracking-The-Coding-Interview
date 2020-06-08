class Node{
Node left,right;
int val;
Node(int x){
val = x;
}
}
public class minimalBST{
  //static Node root;
  public Node bst(int arr[]){
    return helper(arr,0,arr.length-1);
  }
  public Node helper(int a[],int s,int e){
    if(e<s) return null;
    int mid = (s+e)/2;
    Node root = new Node(a[mid]);
    root.left = helper(a,s,mid-1);
    root.right = helper(a,mid+1,e);
    return root;
  }
  public void show(Node n){
    if(n == null) return;
    show(n.left);
    System.out.println(n.val);
    show(n.right);
  }
  public static void main(String args[]){
    minimalBST b = new minimalBST();
    int[] n = new int[]{1,2,3,4,5,6,7};
    Node s = b.bst(n);
    b.show(s);
  }
}
