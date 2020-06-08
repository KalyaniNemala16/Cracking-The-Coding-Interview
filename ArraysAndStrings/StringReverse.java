import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse{
  public static String reverse(String s){
    if(s.isEmpty()) return "null string";
    if(s.length()==1) return s;
    char c[] = new char[s.length()];
    int j=0;

    for(int i = s.length()-1 ; i>=0 && j<=s.length() ; i--){
      c[j] = s.charAt(i);
      j++;
    }
    String res = new String(c);
    return res;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    System.out.println(reverse(str));
  }
}
