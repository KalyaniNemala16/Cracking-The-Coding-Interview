import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class repeatChars{
public static void main(String args[]){
String str = new String("aabbc");
int val;
Map<Character,Integer> m = new HashMap<Character,Integer>();
for(int i = 0 ; i<str.length() ; i++){
  if(m.containsKey(str.charAt(i))){
  val = m.get(str.charAt(i));
  val++;
  m.put(str.charAt(i),val);
  }
  else{
  m.put(str.charAt(i),1);
  }
}
int count = 0;
for(Map.Entry<Character,Integer> e : m.entrySet()){
if(e.getValue()%2!=0){
  count++;
}
}
if(count == 1) System.out.println("true");
else System.out.println("false");
}
}
