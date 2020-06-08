import java.util.Stack;

public class sortStack{

  static Stack<Integer> sort(Stack<Integer> org){
    Stack<Integer> buffer = new Stack<Integer>();
    int temp;
    while(!org.isEmpty()){
      temp = org.pop();
    while(!buffer.isEmpty() && buffer.peek()>temp){
      org.push(buffer.pop());
    }
    buffer.push(temp);

  }
  while(!buffer.isEmpty()){
    org.push(buffer.pop());
  }
  return org;
  }
  public static void main(String args[]){
    Stack<Integer> s = new Stack<Integer>();
    s.push(2);
    s.push(3);
    s.push(1);
    s.push(10);
    s.push(3);
    s.push(12);

    sortStack st = new sortStack();
    s = st.sort(s);

    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());


  }
}
