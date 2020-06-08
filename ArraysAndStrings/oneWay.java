import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class oneWay{

  static boolean replace(String a,String b){
    boolean flag=false;
    int i=0;
    while(i<a.length() && i<b.length()){
    if(a.charAt(i)!=b.charAt(i)){
      if(flag){
        return false;
      }
      flag = true;
    }
    i++;
  }
  return true;
  }
  static boolean insert(String a,String b){
    int index1=0;
    int index2=0;
    int one = a.length();
    int two = b.length();
    boolean flag=false;
    while(index1<one && index2<two){
      if(a.charAt(index1)!=b.charAt(index2)){
        if(flag){
          return false;
        }
        flag=true;
        index2++;
      }
      else{
        index1++; index2++;
      }

    }
    return true;
  }

  static boolean decide(String str1,String str2){

    String a=str1.length()<str2.length()?str1:str2;
    String b=str1.length()<str2.length()?str2:str1;
    int one = a.length();
    int two = b.length();

    if(two-one > 1) return false;
    else if(two-one == 0) return replace(a,b);
    else if(two-one == 1) return insert(a,b);
    return false;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String a = bf.readLine();
    String b = bf.readLine();
    System.out.println(decide(a,b));

  }
}
