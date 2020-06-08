import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class linkedListDups{
  static Node head;
  static public class Node{
    Node next;
    int data;
    Node(int d){
      data = d;
      next = null;
    }
  }
  public static linkedListDups delete(linkedListDups list){
    Set<Integer> s = new HashSet<Integer>();
    Node curr = list.head;
    Node prev = null;
    /*if(curr != null)
    {s.add(curr.data);
      prev = curr;
      curr=curr.next;}
      else{
        return list;
      }*/
    while(curr != null){
      //s.add(curr.data);
      if(s.contains(curr.data)){
        prev.next = curr.next;
        curr = curr.next;
      }
      else{
        s.add(curr.data);
        prev = curr;
        curr = curr.next;
      }

    }

    return list;
  }

  public static void print(linkedListDups list){
    Node n = list.head;
    while(n!=null){
      System.out.println(n.data);
      n = n.next;
    }
  }

  public static linkedListDups insert(linkedListDups list, int val){

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


  public static void main(String arg[]) throws IOException{
    linkedListDups l = new linkedListDups();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter how many elements: ");
    int n = Integer.parseInt(bf.readLine());
    System.out.println("Enter elements: ");
    for(int i=0 ; i<n ; i++){
      int x = Integer.parseInt(bf.readLine());
      l = insert(l,x);
    }
    /*l=insert(l,5);
    l=insert(l,3);
    l=insert(l,10);
    l=insert(l,20);
    l=insert(l,5);
    l=insert(l,15);
    l=insert(l,20);*/
    /*l.head = new Node(5);
    l.head.next = new Node(3);
    l.head.next.next = new Node(10);
    l.head.next.next.next = new Node(20);
    l.head.next.next.next.next = new Node(5);
    l.head.next.next.next.next.next = new Node(5);
    l.head.next.next.next.next.next.next = new Node(15);
    l.head.next.next.next.next.next.next.next = new Node(20);*/

    print(l);

    l = delete(l);

    System.out.println("Printing after deleting duplicates");
    print(l);


  }
}
