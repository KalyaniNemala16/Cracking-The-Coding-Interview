import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class urloptimized{
  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str1=bf.readLine();
    StringBuilder sb=new StringBuilder(str1);
    System.out.println(sb);
    for(int i=0;i<str1.length();i++){
    if(Character.isWhitespace(str1.charAt(i))){
      sb.replace(i,i+1,"%20");
    }}
    System.out.println(sb);
  }

}
