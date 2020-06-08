import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class palPerm{
  public static boolean palind(String s){
    int count=0;
    int a[] = new int[128];
    for(int i=0;i<s.length();i++){
    int val = s.charAt(i);
    a[val] = ++a[val];
    }
    for(int p : a){
      if(p%2!=0)
      count++;

    }System.out.println(count);

    if(count>1)
      return false;
    else
    return true;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str=bf.readLine();
    String str2=str.replaceAll(" ","");
    str2=str2.toLowerCase();
    System.out.println(palind(str2));

  }
}
