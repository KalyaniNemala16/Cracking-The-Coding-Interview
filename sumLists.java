import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sumLists{
  static Node head;
  static public class Node {
    Node next;
    int data;
    Node(int d){
      d = data;
      next = null;
    }
  }
  public static sumLists insert(sumLists list,int val){
    Node new_node = new Node(val);
    new_node.next = null;
    if(list.head == null){
      list.head = new_node;
    }
    else{
      Node last = list.head;
      while(last.next!=null){
        last = last.next;
      }
      last.next = new_node;
    }
    return list;
  }
/*  public static Node addHelper(Node l1,Node l2){

    Node f = l1;
    Node s = l2;
    int c = 0;
    int sum = 0;
    int val = 0;
    Node res = null;

    while(f!=null && s!=null){
      sum = f.data + s.data + c;
      val = sum%10;
      res = insert(res,val);
      c = sum/10;
      f = f.next;
      s = s.next;
    }
    if(f!=null && s==null ){
      while(f!=null){
      sum = f.data + c;
      val = sum%10;
      res = insert(res,val);
      c = sum/10;
      f = f.next;
    }
    }
    else if(f==null && s!=null){
      while(s!=null){
      sum = s.data + c;
      val = sum%10;
      res = insert(res,val);
      c = sum/10;
      s = s.next;
    }
    }
    return res;
  }*/
  /*public static Node addNode(Node n,int val){
    Node new_node = new Node(val);
    new_node.next = null;
    if(n == null){
      n = new_node;
    }
    else{
      Node last = n;
      while(last.next!=null){
        last = last.next;
      }
      last.next = new_node;
    }
    return new_node;
  }*/
  public static void print(Node n){
    while(n!=null){
      System.out.print(n.data + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException{
    sumLists l1 = new sumLists();
    sumLists l2 = new sumLists();
    //System.out.println("Enter elems into list 1");
    l1 = insert(l1,7);
    l1 = insert(l1,1);
    l1 = insert(l1,6);

    l2 = insert(l2,9);
    l2 = insert(l2,4);
    l2 = insert(l2,5);
    print(l1.head);
    //print(l2);
  //  Node l3 = addHelper(l1,l2);
    /*if(l3 == null){
      System .out.println("0");
    }
    else
    print(l3);*/
  }
}
