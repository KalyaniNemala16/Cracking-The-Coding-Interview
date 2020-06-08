import java.util.Collections;

public class minimalTree{
  Node root;
  public static class Node{
    Node left,right;
    int val;
    public Node(int data){
      val = data;
      left = null;
      right = null;
    }

  }
  public static Node minimum(int arr[]){
    int s = 0;
    int e = arr.length-1;
    return minimum(arr,s,e);
  }
  public static Node minimum(int arr[],int low,int high){
    if(high<low) return null;
    int mid = (low+high)/2;
    Node n = new Node(arr[mid]);
    n.left = minimum(arr,low,mid-1);
    n.right = minimum(arr,mid+1,high);
    return n;
  }
  public static void inOrder(Node m){
    if(m!=null){
      inOrder(m.left);
      System.out.println(m.val);
      inOrder(m.right);
    }

  }
  public static void main(String args[]){
    minimalTree m = new minimalTree();
    int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
    Node res = m.minimum(a);
    m.inOrder(res);
  }
}
