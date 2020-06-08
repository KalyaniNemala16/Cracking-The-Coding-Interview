import java.util.*;

class Node{
	Node left,right;
	int val;
	Node(int val){
	this.val = val;
	}
}



public class order{
static Node root;

public ArrayList<LinkedList<Integer>> listOrder(Node root){
ArrayList<LinkedList<Integer>> al = new ArrayList<LinkedList<Integer>>();
int level = 0;
	return helper(root,al,level);
}

	
public ArrayList<LinkedList<Integer>> helper(Node n,ArrayList<LinkedList<Integer>> al,int level){
	if(n == null) return al;
	LinkedList<Integer> list;
	if(level < al.size()){
	list = al.get(level);
	list.add(n.val);
	}
	else{
	list = new LinkedList<Integer>();
	list.add(n.val);
	al.add(level,list);
	}
	if(n.left  != null)
	al = helper(n.left, al, level+1);

	if(n.right != null){
	al = helper(n.right, al, level+1);
	}

	return al;
}
	public static void main(String args[]){
	order o = new order();
	root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.left.left = new Node(7);
	root.left.left.right = new Node(8);
	root.right.left = new Node(5);
	root.right.left.right = new Node(6);

	ArrayList<LinkedList<Integer>> res = new ArrayList<LinkedList<Integer>>();
	res = o.listOrder(root);
	Iterator<LinkedList<Integer>> itr = res.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	}
}