import java.util.*;


class Node{
	char val;
	ArrayList<Node> adj;
	Node(char val){
	this.val = val;
	adj = new ArrayList<Node>();
	}
	Node(){
	adj = new ArrayList<Node>();
	}
}


public class BuildOrder{

HashMap<Node,Integer> map;
BuildOrder(){
	map = new HashMap<Node,Integer>();
}

public void depend(Node v,Node w){
	v.adj.add(w);
	map.put(w,map.get(w)+1);

}

public void buildGraph(char[] project,char[][] depend){
	HashMap<Character,Node> m = new HashMap<Character,Node>();
	for(int i=0 ; i<project.length ; i++){
		Node temp = new Node(project[i]);
		map.put(temp,0);
		m.put(project[i],temp);
	}

	for(int i=0 ; i<depend.length ; i++){
		char node1 = depend[i][0];
		char node2 = depend[i][1];
		depend(m.get(node1), m.get(node2));
	}

}
public ArrayList<Character> buildOrder(){
	Queue<Node> q = new LinkedList<Node>();
	ArrayList<Character> al = new ArrayList<Character>();


	Set<Node> key = map.keySet();
	for (Node node : key) {
	if(map.get(node) == 0){
	q.add(node);
	//System.out.println(q.peek());
	//map.remove(node);
	//System.out.println(map);
	}
	}

	if (q.isEmpty()) {
	return new ArrayList<Character>();
	}

	while(!q.isEmpty()){
		Node n = q.poll();
		al.add(n.val);
		if(!n.adj.isEmpty()){
			Iterator<Node> itr = n.adj.iterator();
			while(itr.hasNext()){
				Node v = itr.next();
				map.put(v,map.get(v)-1);
				if(map.get(v) == 0){
					q.add(v);
					//map.remove(v);
				}
			}
		}
	}
	if(key.size() != al.size()) return new ArrayList<Character>();
	return al;
}
	public static void main(String args[]){
	BuildOrder b = new BuildOrder();


	char project[] = new char[]{'a','b','c','d','e','f'};
	char depend[][] = new char[][]{{'a','d'},{'f','b'},{'b','d'},{'f','a'},{'d','c'}};

	b.buildGraph(project,depend); //O(V+E)

		ArrayList<Character> ar = b.buildOrder(); //O(V)
		if(ar.isEmpty()) System.out.println("Error");
		else
		System.out.println(ar);
		ar.clear();
	//System.out.println(b.map);
	}
}
