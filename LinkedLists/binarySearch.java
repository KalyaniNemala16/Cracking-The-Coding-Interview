
public class palindromeLL{
  static Node head;
class Node{
Node next;
int val;
Node(int val){
this.val = val;
}
}

public boolean palindrome(Node head){

}

public static void main(String args[]){
head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(2);
head.next.next.next.next = new Node();
}


}
