import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class DuplicateChars{
public static void main(String args[]) throws IOException
{
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Input String:");
  String s = bf.readLine();
  if(s.isEmpty()) System.out.println("Empty string");
  else{
    s = s.toLowerCase();
    Map<Character,Integer> m = new HashMap<Character,Integer>();
    for(int i = 0 ; i < s.length() ; i++){
      if(m.containsKey(s.charAt(i))){
        m.put(s.charAt(i),m.get(s.charAt(i))+1);
      }
      else{
        m.put(s.charAt(i),1);
      }

    }
    for(Map.Entry<Character,Integer> entry : m.entrySet()){
      char c = entry.getKey();
      int k = entry.getValue();
      if(k>1)
      System.out.print(c+" ");
    }
  }
}
}
