import java.util.Collections;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;


public class queueDemo{
  static void demo(){
    Deque<String> de = new ArrayDeque<>();
    de.add("hi");
    de.add("he");
    de.add("hp");
    de.add("hicl");

    System.out.println(de.remove()); //can also use removeFirst()
    System.out.println(de.remove());
    System.out.println(de.remove());
    System.out.println(de.remove());
    
    //using empty queue as Stack-LIFO
    de.push("hi");
    de.push("he");
    de.push("hp");
    de.push("hcl");

    System.out.println(de.pop());
    System.out.println(de.pop());
    System.out.println(de.pop());
    System.out.println(de.pop());
  }



  public static void main(String a[]){
    demo();
  }
}
