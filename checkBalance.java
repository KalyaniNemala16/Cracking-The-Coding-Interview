public class checkBalance{
  public static class Node{
    int val;
    Node left,right;
    public Node(int data){
      val = data;
      left = null;
      right = null;
    }
  }
  public static int checkHeight(Node m){
    if(m == null) return -1;
    int left_h = checkHeight(m.left);
    if(left_h == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    int right_h = checkHeight(m.right);
    if(right_h == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    int diff = Math.abs(left_h - right_h);
    if(diff>1) return Integer.MIN_VALUE;
    else return Math.max(left_h,right_h) + 1;

  }
  public static boolean checkBal(Node root){
    int hval = checkHeight(root);
    if(hval!=Integer.MIN_VALUE) return true;
    else return false;

  }
  public static Node createBST(int arr[],int low,int high){
    int mid = (low+high)/2;
    Node m = new Node(arr[mid]);
    if(high<low) return null;
    m.left = createBST(arr,low,mid-1);
    m.right = createBST(arr,mid+1,high);
    return m;
  }
  public static Node createBST(int arr[]){
    Node m = createBST(arr,0,arr.length-1);
    return m;
  }
  public static void main(String args[]){
    checkBalance c = new checkBalance();
    int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
    Node n = createBST(a);
    System.out.println(c.checkBal(n));

    Node n1 = new Node(1);
    n1.left = new Node(2);
    n1.left.left = new Node(4);
    n1.left.right = new Node(5);
    n1.left.right.left = new Node(6);
    n1.left.right.left.right = new Node(7);
    n1.right = new Node(3);
    n1.right.left = new Node(8);
    n1.right.right = new Node(9);
    System.out.println(c.checkBal(n1));



  }
}
