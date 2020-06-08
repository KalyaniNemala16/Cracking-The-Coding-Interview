import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class stringRotate{
  static boolean isSubstring(String s1, String s2){
    if(s1.contains(s2)){
      return true;
    }
    else
    return false;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the strings:");
    String str1 = bf.readLine();
    String str2 = bf.readLine();
    if(str1.length()!=str2.length() || str1.length()==0 || str2.length()==0) {System.out.println("false");}
    else{
    String snew=str1 + str1;
    if(isSubstring(snew, str2)){
      System.out.println("true");
    }
    else
    System.out.println("false");
  }
}
}
