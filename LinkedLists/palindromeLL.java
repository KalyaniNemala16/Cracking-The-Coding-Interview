import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class palindromeLL{
  static Node head;
class Node{
Node next;
int val;
Node(int val){
this.val = val;
}
}

class Result{
  boolean isEqual;
  Node node;
  Result(boolean isEqual,Node node){
    this.isEqual = isEqual;
    this.node = node;
  }
}

public boolean palindrome(Node head){
  int len = length(head);
  Result r = helper(head,len);
  return r.isEqual;
}
public Result helper(Node n,int len){
  if(n == null || len <= 0){
    return new Result(true,n);
  }
  else if(len == 1){
    return new Result(true,n.next);
  }

  Result res = helper(n.next,len-2);

  if(n == null || !res.isEqual){
    return res;
  }

  if(res.node.val == n.val){
    res.isEqual = true;
    res.node = res.node.next;
  }
  else
  {
    res.isEqual = false;
    res.node = res.node.next;
}
return res;
}

public int length(Node head){
  Node curr = head;
  int len = 0;
  while(curr != null){
    len ++;
    curr = curr.next;
  }
  return len;
}
public void add(int x){
  Node n = new Node(x);
  if(head == null){
    head = n;
  }
  else{
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = n;
  }
}

public static void main(String args[]) throws IOException{
  palindromeLL p = new palindromeLL();

  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Length:");
  int n = Integer.parseInt(bf.readLine());
  for(int i = 0 ; i<n ; i++){
    int val = Integer.parseInt(bf.readLine());
    p.add(val);
  }
  System.out.println(p.palindrome(head));

}
}
