import java.util.*;

public class RobotGrid{
	public static ArrayList<ArrayList<Integer>> findPath(int[][] m){
		ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
		boolean f = findPath(m, m.length - 1, m[0].length - 1, path);
		if(f)
		return path;
		else
		return new ArrayList<ArrayList<Integer>>();

	}

	public static boolean findPath(int[][] m, int i, int j, ArrayList<ArrayList<Integer>> path){
		if(i>m.length - 1 || j>m[0].length - 1 || m[i][j] == 0){
			return false;
		}

		/* boolean end = false;
		if(i == m.length - 1 && j == m[0].length - 1){
		end = true;
		}*/

		boolean right = findPath(m,i,j+1,path);
		boolean down = findPath(m,i+1,j,path);

		if(right || down || (i == m.length - 1 && j == m[0].length - 1)){
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(i);
			a.add(j);
			path.add(a);
			return true;
		}
		return false;
	} 

	public static void main(String args[]){
	RobotGrid r = new RobotGrid();
	int[][] m = new int[][]{{1,0,1,1},{1,1,1,1},{0,1,0,1},{1,1,1,1}};
	System.out.println(r.findPath(m));

	}
}