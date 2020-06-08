public class unsortedDuplicate{
  static ListNode head;
  public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
      val = x;
      next = null;
    }
  }

  public void add(int data){
    ListNode temp = head;
    if(head == null){
      ListNode curr = new ListNode(data);
      head = curr;
    }
    else{
      ListNode curr = new ListNode(data);
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = curr;
    }
  }

  public void show(ListNode head){
    ListNode temp = head;
    if(head == null) System.out.println("Empty list");
    else{
      while(temp!=null){
        System.out.print(temp.val);
        temp = temp.next;
      }
    }
  }

  public ListNode removedups(ListNode head){
    ListNode i = head;
    ListNode j = i.next;
    ListNode temp;
    ListNode prev = i;
    while(i!=null && i.next!=null){
      while(j!=null){
        if(i.val == j.val){
          temp = j;
          j = j.next;
          prev.next = j;
          temp.next = null;
        }
        else{
          prev = j;
          j = j.next;
        }
      }
      i = i.next;
      j = i.next;
    }
    return head;
  }

public static void main(String args[]){
  unsortedDuplicate us = new unsortedDuplicate();
  us.add(5);
  us.add(6);
  us.add(1);
  us.add(3);
  us.add(1);
  us.add(4);
  us.add(5);

  us.removedups(head);
  us.show(head);



}
}
