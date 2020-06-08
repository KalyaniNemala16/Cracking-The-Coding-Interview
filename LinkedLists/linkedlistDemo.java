import java.io.*;

public class linkedlistDemo{
  Node head;

  static public class Node{
    Node next;
    int data;
    Node(int d){
      data=d;
      next=null;
    }
  }

  public static linkedlistDemo insert(linkedlistDemo list, int value){
    Node new_node = new Node(value);
    new_node.next = null;

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

  public static void print(linkedlistDemo list){
    Node curreNode = list.head;
    while(curreNode != null){
      System.out.println(curreNode.data + " ");
      curreNode = curreNode.next;
    }
  }
  public static linkedlistDemo deletebyKey(linkedlistDemo list, int key){
    Node currNode = list.head;
    if(currNode!=null && currNode.data == key){
      System.out.println(key+ " found and deleted");
    }
    Node prev = currNode;
    while(currNode!=null && currNode.data!=key){
      prev = currNode;
      currNode = currNode.next;
    }
    prev.next = currNode.next;
    System.out.println(key+ " found and deleted");

    if(currNode == null){
      System.out.println("key not found");
    }
    return list;

  }

  public static linkedlistDemo deleteByPos(linkedlistDemo list, int pos){
    Node currNode = list.head;
    Node prev = null;
    int count=0;

    if(pos==0 && currNode!=null){
      list.head = currNode.next;
      System.out.println("found and deleted at " + pos);
      return list;
    }
    while(currNode!=null){
      if(pos==count)
      {
        prev.next = currNode.next;
        System.out.println("found and deleted at : " + pos);
        return list;
      }
      else{
        prev = currNode;
        currNode = currNode.next;
        count++;
      }
      if(currNode==null){
        System.out.println("position not found");
      }

    }
    return list;
  }


  public static void main(String args[]){
    linkedlistDemo list = new linkedlistDemo();
    list = insert(list, 10);
    list = insert(list, 30);
    list = insert(list, 4);
    list = insert(list, 3);
    list = insert(list, 50);

    print(list);

    list = deletebyKey(list, 30);
    print(list);

    list = deleteByPos(list, 3);
    print(list);

  }
}
