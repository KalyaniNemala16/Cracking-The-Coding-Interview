import java.util.*;

public class StringPerm{
	public static ArrayList<String> permutate(String str){
	if(str == null) return null;

	ArrayList<String> perm = new ArrayList<String>();
	if(str.length() == 0){
		perm.add("");
		return perm;
	}

	char first = str.charAt(0);
	ArrayList<String> words = new ArrayList<String>();
	words = permutate(str.substring(1));
	for(String word : words){
		for(int j = 0 ; j<=word.length() ; j++){
			String s = insert(first,word,j);
			perm.add(s);
		}
	}
	return perm;
	}

	public static String insert(char first, String word, int j){
		String start = word.substring(0,j);
		String end = word.substring(j);
		return start + first + end;
	}
	public static void main(String args[]){
		StringPerm s = new StringPerm();
		String str = "abc";		
		System.out.println(permutate(str));

	}
}