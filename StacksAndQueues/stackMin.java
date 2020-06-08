import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

 class stackMin extends Stack<Integer>{

  Stack<Integer> minstack = new Stack<Integer>();

  public void push(int val){
    if(val < min())
    {
      minstack.push(val);
    }
    super.push(val);
  }
    public Integer pop(){
    int x = super.pop();
    if(x == minstack.peek()){
      minstack.pop();
    }
    return x;
  }
  public int min(){
    if(minstack.isEmpty()){
      return Integer.MAX_VALUE;
    }
    else{
      return minstack.peek();
    }
  }


  public static void main(String args[]) throws IOException{
    stackMin s = new stackMin();
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter no of elements");
    int n = Integer.parseInt(sc.readLine());
System.out.println("Enter elements");
    for(int i=0 ; i<n ; i++){
      int val = Integer.parseInt(sc.readLine());
      s.push(val);
    }

      for(int i = 0 ; i < n ; i++){
        System.out.println("Element popped from stack:");
        System.out.println(s.pop());
        System.out.println("Minimum element:");
        System.out.println(s.min());
      }


  }


}
