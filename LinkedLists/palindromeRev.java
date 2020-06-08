import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Stack;

public class palindromeRev{
  static Node head;
  public static class Node{
    Node next;
    int data;
    Node(int d){
      data = d;
      next = null;
    }
  }
  public static Node reverse(Node n){
    Node head = null;
    while(n != null){
      Node new_node = new Node(n.data);
      new_node.next = head;
      head = new_node;
      n = n.next;
    }
    return head;
  }
  public static boolean palindrome(Node first, Node second){
    while(first!=null && second!=null){
      if(first.data != second.data)
      return false;
      else{
        first =first.next;
        second = second.next;
      }
    }
    return true;
  }
  public static palindromeRev insert(palindromeRev list, int val){
    Node new_node = new Node(val);
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
  public static boolean checkPal(Node n){
    Node first = n;
    Node second = n;
    Stack<Integer> s = new Stack<Integer>();
    while(first!=null && first.next!=null){
      s.push(second.data);
      second = second.next;
      first = first.next.next;
    }
    if(first != null){
      second = second.next;
    }
    while(second != null){
      int top = s.pop().intValue();
      if(top!=second.data){
        return false;
      }
      second = second.next;
    }
    return true;
  }


  public static void main(String args[]) throws IOException {
    palindromeRev l = new palindromeRev();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter no of elems: ");
    int n = Integer.parseInt(bf.readLine());
    System.out.println("Enter elements :");
    for(int i=0; i<n ; i++){
      int x = Integer.parseInt(bf.readLine());
      l = insert(l,x);
    }
    Node second = reverse(l.head);
    //System.out.println(l.head.data + " " + second.data);
    System.out.println("Using reverse of linked list and comparing:");
    System.out.println(palindrome(l.head, second));
    System.out.println("Using iteration:");
    System.out.println(checkPal(l.head));


  }
}
