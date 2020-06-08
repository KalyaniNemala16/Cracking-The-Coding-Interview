import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compressString{
  public static String compress(String str){
    if(str.isEmpty()) return"Empty String";
    if(str.length() == 1) return str.charAt(0)+"1";
    int count = 1; int i;
    String s_new = "";
    for(i = 0 ; i<str.length()-1 ; i++){
      if(str.charAt(i) != str.charAt(i+1)){
        s_new = s_new + str.charAt(i) + count;
        count = 1;
      }
      else
      count++;
    }
    s_new = s_new + str.charAt(i) + count;
    if(s_new.length() >= str.length()) return str;
    return s_new;
  } 
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String s = bf.readLine();
    s = s.toLowerCase();
    System.out.println(compress(s));
  }
}
