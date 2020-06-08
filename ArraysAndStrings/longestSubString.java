import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class longestSubString{
  public static void returnLength(String s){
    //if(s.isEmpty())
            //return 1;
        Set<Character> set = new HashSet<Character>();
        Set<Integer> num_set = new HashSet<Integer>();
        int len = 0;
        for(int i = 0; i< s.length() ; i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                set.add(s.charAt(i));
                num_set.add(len);
                len = 1;
            }
            else{
                set.add(s.charAt(i));
                len++;
            }
        }
        TreeSet<Integer> tree = new TreeSet<Integer>(num_set).descendingSet();
        //return tree;
        System.out.println(tree);

  }
  public static void main(String args[]){
    String s = "pwwkew";
    returnLength(s);
    //TreeSet<Integer> f = returnLength(s);
    //System.out.println();


  }
}
