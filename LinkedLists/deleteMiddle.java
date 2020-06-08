import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class deleteMiddle{
  static Node head;
  static public class Node{
    Node next;
    int data;
    Node(int d){
      data = d;
      next = null;
    }
  }

  public static deleteMiddle insert(deleteMiddle list, int val){
    Node newn = new Node(val);
    newn.next = null;
    if(list.head == null){
      list.head = newn;
    }
    else{
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = newn;
    }
    return list;

  }

  public static Node getNode(deleteMiddle list, int val){
    Node curr = list.head;
    while(curr != null){
      if(curr.data == val){
        return curr;
      }
      curr = curr.next;
    }
    return curr;
  }
  public static void delete(Node p){
      p.data = p.next.data;
      p.next = p.next.next;
  }
  public static void print(deleteMiddle list){
    Node curr = list.head;
    while(curr != null){
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    deleteMiddle l = new deleteMiddle();
    l = insert(l, 3);
    l = insert(l, 4);
    l = insert(l, 6);
    l = insert(l, 10);
    l = insert(l, 2);
    l = insert(l, 11);
    l = insert(l, 23);

    System.out.println("Enter the element to delete:");
    int x = Integer.parseInt(bf.readLine());
    Node n = getNode(l,x);
    if(n == null){
      System.out.println("Element not found in list");
    }
    else{
    delete(n);
    print(l);
    }

  }
}
