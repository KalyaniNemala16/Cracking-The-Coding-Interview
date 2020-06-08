public class kthtoLast{
  static ListNode head;
  public class ListNode{
    ListNode next;
    int val;
    ListNode(int x){
      val = x;
    }
  }

  public void add(int data){
    ListNode curr = new ListNode(data);
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
  public int show(ListNode head,int k){
    ListNode i = head;
    ListNode j = head;
    if(head == null) return Integer.MAX_VALUE;
    for(int n = 0 ; n<k ; n++){
      j = j.next;
    }
    while(j!=null){
      i = i.next;
      j = j.next;
    }
    return i.val;
  }
  public static void main(String args[]){
    kthtoLast k = new kthtoLast();
    k.add(1);
    k.add(2);
    k.add(3);
    k.add(4);
    k.add(5);
    int val = k.show(head,1);
    if(val == Integer.MAX_VALUE)
    System.out.println("null");
    else
    System.out.println(val);
  }
}
