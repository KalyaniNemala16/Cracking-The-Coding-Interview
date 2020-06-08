import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Anagrams{
  public static String checkAnagrams(String s,String k){
    Map<Character,Integer> m = new HashMap<Character,Integer>();
    for(int i = 0; i < s.length() ; i++){
      if(m.containsKey(s.charAt(i))){
        m.put(s.charAt(i),m.get(s.charAt(i))+1);
      }
      else
      m.put(s.charAt(i),1);
    }
    for(int i = 0; i < k.length() ; i++){
      if(m.containsKey(k.charAt(i))){
        m.put(k.charAt(i),m.get(k.charAt(i))+1);
      }
      else
      return "Not Anagrams";
    }
    for(int i : m.values()){
      if(i%2!=0)
      return "Not Anagrams";
    }
    return "Anagrams";
  }
  public static void main(String args[])throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str1 = bf.readLine();
    String str2 = bf.readLine();
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    str1 = str1.replace(" ","");
    str2 = str2.replace(" ","");
    if(str1.equals(str2))
    System.out.println("Anagrams");
    else if(str1.length() == str2.length()){
      System.out.println(checkAnagrams(str1,str2));
    }
    else
    System.out.println("Not Anagarams");
  }
}
