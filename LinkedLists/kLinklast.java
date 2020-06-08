import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class kLinklast{
  static Node head;
  static public class Node{
    Node next;
    int data;
    Node(int d){
      data = d;
      next = null;
    }
  }
  static public kLinklast insert(kLinklast list, int val){
    Node new_node = new Node(val);
    new_node.next = null;
    if(list.head == null){
      list.head = new_node;
    }
    else{
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = new_node;
    }
    return list;
  }

   static public int recursion(Node head, int k){
     if(head == null) return 0;
     int index = recursion(head.next, k) + 1;
     if(index == k){
       System.out.println(head.data);
     }
     return index;

   }

   public static Node iteration(Node head, int k){
     Node p1 = head; Node p2 = head;
     for(int i=0 ; i<k ;i++){
       p1 = p1.next;
     }
     while(p1 != null){
       p1 = p1.next;
       p2 = p2.next;
     }
     return p2;
   }

  public static void main(String args[]) throws IOException{
    kLinklast l = new kLinklast();
    l = insert(l,1);
    l = insert(l,2);
    l = insert(l,3);
    l = insert(l,4);
    l = insert(l,5);
    l = insert(l,6);
    l = insert(l,7);
    l = insert(l,8);
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter k from last:");
    int x = Integer.parseInt(bf.readLine());
    System.out.println("Using recursion");
    recursion(l.head, x);
    Node n = iteration(l.head, x);
    System.out.println("Using iteration");
    System.out.println(n.data);

  }
}
