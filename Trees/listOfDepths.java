import java.util.*;

public class listOfDepths{

  public static class Node{
    int val;
    Node left,right;
    public Node(int data){
      val = data;
      left = null;
      right = null;
    }
  }

  public static void depths(Node m,ArrayList<LinkedList<Node>> alist,int level){
    if(m == null) return;
    LinkedList<Node> list = null;
    if(alist.size() == level){
      list = new LinkedList<Node>();
      alist.add(list);
    }
    else{
      list = alist.get(level);
    }
    list.add(m);
    depths(m.left,alist,level+1);
    depths(m.right,alist,level+1);
  }

  public static ArrayList<LinkedList<Node>> depths(Node root){
    ArrayList<LinkedList<Node>> a = new ArrayList<LinkedList<Node>>();
    depths(root,a,0);
    return a;
  }

  public static Node createBST(int arr[],int low,int high){
    int mid = (low+high)/2;
    if(high<low) return null;
    Node new_node = new Node(arr[mid]);
    new_node.left = createBST(arr,low,mid-1);
    new_node.right = createBST(arr,mid+1,high);
    return new_node;
  }

  public static Node createBST(int arr[]){
    Node new1 = createBST(arr,0,arr.length-1);
    return new1;
  }

  public static void main(String args[]){
    int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
    listOfDepths l = new listOfDepths();
    Node root = l.createBST(a);
    ArrayList<LinkedList<Node>> list = l.depths(root);
    ListIterator<LinkedList<Node>> itr = list.listIterator();
    while(itr.hasNext()){
      LinkedList<Node> h = itr.next();
      System.out.println(h);
    }

  }

}
