import java.util.*;

public class PowerSet{
	public static ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> set){
		return helper(0,set);
	}

	public static ArrayList<ArrayList<Integer>> helper(int index, ArrayList<Integer> set){
	ArrayList<ArrayList<Integer>> al;
	if(index == set.size()){
		ArrayList<Integer> empty = new ArrayList<Integer>();
		al = new ArrayList<ArrayList<Integer>>();
		al.add(empty);
		return al;
	}

	al = helper(index+1,set);
	int size = al.size();
	for(int i=0 ; i<size ;i++){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.addAll(al.get(i));
		temp.add(set.get(index));
		al.add(temp);
	}
	
	return al;	
}
	
	public static void main(String args[]){
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		//set.add(3);
		//set.add(4);

		ArrayList<ArrayList<Integer>> a = powerset(set);
		System.out.print(a);
	}
}