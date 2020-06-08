import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class checkPerm{
  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str1=bf.readLine();
    String str2=bf.readLine();
    char c1[]=str1.toCharArray();
    char c2[]=str2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String string1=new String(c1);
    String string2=new String(c2);
    if(string1.length()==string2.length()){
      if(string1.equals(string2))
      {System.out.println("Permutable strings");}
      else
      System.out.println("Not Permutable strings");
    }
    else
    System.out.println("Not permutable strings");
  }
}
