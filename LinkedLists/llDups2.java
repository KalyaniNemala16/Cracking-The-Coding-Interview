import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class llDups2{
  Node head;
  public static class Node{
    Node next;
    int data;
    Node(int d){
      data = d;
      next = null;
    }
  }

  public static llDups2 deleteDups(llDups2 list){
    /*Node slow = list.head;
    Node fast = slow.next;

    while(slow!=null){
      while(fast!=null && fast!=slow){
        if(fast.data == slow.data){
          fast.data = fast.next.data;
          fast.next = fast.next.next;
        }
        else{
          fast = fast.next;
        }

      }
      slow = slow.next;
      fast = slow.next;
    }
    return list;*/
    Node slow = list.head;
    while(slow!=null){
      Node fast = slow;
      while(fast.next != null){
        if(fast.next.data == slow.data){
          fast.next = fast.next.next;
        }
        else{
          fast = fast.next;
        }
      }
      slow = slow.next;
    }
    return list;
  }

  public static llDups2 insert(llDups2 list, int val){
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


  public static void print(llDups2 list){
    Node curr = list.head;
    while(curr != null){
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  public static void main(String args[]) throws IOException{
    llDups2 l = new llDups2();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter how many elements: ");
    int n = Integer.parseInt(bf.readLine());
    System.out.println("Enter elements: ");
    for(int i=0 ; i<n ; i++){
      int x = Integer.parseInt(bf.readLine());
      l = insert(l,x);
    }
    print(l);

    l = deleteDups(l);

    System.out.println("Printing after deleting duplicates");
    print(l);
  }
}
