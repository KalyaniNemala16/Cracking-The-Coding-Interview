import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class llDupsSet{
  static ListNode head;
  public class ListNode{
    ListNode next;
    int val;
    ListNode(int x){
      val = x;
      next = null;
    }
  }
  public void add(int x){
    ListNode curr = new ListNode(x);
    if(head == null){
      head = curr;
    }
    else{
      ListNode temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = curr;
    }
  }

  public void show(ListNode head){
    ListNode temp = head;
    if(head == null) System.out.println("Empty list");
    while(temp!=null){
      System.out.print(temp.val);
      temp = temp.next;
        }
  }

  public ListNode remove(ListNode head){
    Set<Integer> s = new HashSet<Integer>();
    ListNode temp = head;
    ListNode prev= head;
    while(temp!=null){
      if(s.contains(temp.val)){
        temp = temp.next;
        prev.next = temp;
      }
      else{
        s.add(temp.val);
        prev = temp;
        temp = temp.next;
      }

    }
    return head;

  }
  public static void main(String args[]){
    llDupsSet s = new llDupsSet();
    s.add(5);
    s.add(5);
    //s.add(1);
    //s.add(3);
    //s.add(1);
    //s.add(4);

    s.remove(head);
    s.show(head);
  }
}
