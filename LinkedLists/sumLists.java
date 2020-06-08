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

  public static void print(Node n){
    while(n!=null){
      System.out.print(n.data + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException{
    sumLists l1 = new sumLists();
    sumLists l2 = new sumLists();

    l1 = insert(l1,7);
    l1 = insert(l1,1);
    l1 = insert(l1,6);

    l2 = insert(l2,9);
    l2 = insert(l2,4);
    l2 = insert(l2,5);
    print(l1.head);

  }
}
