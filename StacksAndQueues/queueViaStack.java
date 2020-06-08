import java.util.Stack;

public class queueViaStack{
  static Stack<Integer> s1 = new Stack<Integer>();
  static Stack<Integer> s2 = new Stack<Integer>();
  public static void add(int val){
    s1.push(val);
  }
  public static int remove(){
    int x;
    if(s1.isEmpty() && !s2.isEmpty()){
      x = s2.pop();
      return x;
    }
    else if(!s1.isEmpty() && !s2.isEmpty()){
      x = s2.pop();
      return x;
    }
    else if(!s1.isEmpty() && s2.isEmpty()){
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }
      x = s2.pop();
      return x;
    }
    return -1;
  }
  public static void main(String args[]){
  queueViaStack q = new queueViaStack();
  //MyQueue q = new MyQueue();
  //q.s1 = new Stack<Integer>();
  //q.s2 = new Stack<Integer>();
  q.add(1);
  q.add(2);
  q.add(3);
  System.out.println(q.remove());
  System.out.println(q.remove());
  q.add(5);
  q.add(10);
  System.out.println(q.remove());
  System.out.println(q.remove());
  System.out.println(q.remove());

  }
}
