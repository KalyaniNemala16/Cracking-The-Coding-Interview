
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class dfsGraph
{

	public static class Node
	{
		public static int data;
		public static boolean visited;
		public static List<Node> neighbours;

		Node(int data)
		{
			data=data;
			neighbours=new ArrayList<>();

		}

	}
  public static void addneighbours(Node neighbourNode)
  {
    this.neighbours.add(neighbourNode);
  }
  public static List<Node> getNeighbours() {
    return neighbours;
  }
  public static void setNeighbours(List<Node> neighbours) {
    neighbours = neighbours;
  }

	// Recursive DFS
	public static  void dfs(Node node)
	{
		System.out.print(node.data + " ");
		List<Node> neighbours=node.getNeighbours();
        node.visited=true;
		for (int i = 0; i < neighbours.size(); i++) {
			Node n=neighbours.get(i);
			if(n!=null && !n.visited)
			{
				dfs(n);
			}
		}
	}

	// Iterative DFS using stack
	public static void dfsUsingStack(Node node)
	{
		Stack<Node> stack=new  Stack<Node>();
		stack.add(node);
		while (!stack.isEmpty())
		{
			Node element=stack.pop();
			if(!element.visited)
			{
				System.out.print(element.data + " ");
				element.visited=true;
			}

			List<Node> neighbours=element.getNeighbours();
			for (int i = 0; i < neighbours.size(); i++) {
				Node n=neighbours.get(i);
				if(n!=null && !n.visited)
				{
					stack.add(n);
				}
			}
		}
	}

	public static void main(String arg[])
	{
    dfsGraph dfsExample = new dfsGraph();
		dfsGraph.Node node40 =new dfsGraph.Node(40);
		dfsGraph.Node node10 =new dfsGraph.Node(10);
		dfsGraph.Node node20 =new dfsGraph.Node(20);
		dfsGraph.Node node30 =new dfsGraph.Node(30);
		dfsGraph.Node node60 =new dfsGraph.Node(60);
		dfsGraph.Node node50 =new dfsGraph.Node(50);
		dfsGraph.Node node70 =new dfsGraph.Node(70);

		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);



		System.out.println("The DFS traversal of the graph using stack ");
		dfsGraph.dfsUsingStack(node40);

		System.out.println();

		// Resetting the visited flag for nodes
		node40.visited=false;
		node10.visited=false;
		node20.visited=false;
		node30.visited=false;
		node60.visited=false;
		node50.visited=false;
		node70.visited=false;


		System.out.println("The DFS traversal of the graph using recursion ");
		dfsGraph.dfs(node40);
	}
}
