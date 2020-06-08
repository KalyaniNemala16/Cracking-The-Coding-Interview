import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class checkPerm2{

  public static boolean perm(String one,String two){
    int arr[]=new int[128];
    for(int i=0;i<one.length();i++){
      int val=one.charAt(i);
      arr[val]=arr[val]+1;
    }
    for(int i=0;i<one.length();i++){
      int val=two.charAt(i);
      arr[val]=arr[val]-1;
      if(arr[val]<0)
      return false;
    }
     return true;
  }



  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str1=bf.readLine();
    String str2=bf.readLine();
    if(str1.length()!=str2.length()){System.out.println("Not Permutable");}
    else
    {
    if(perm(str1,str2))
    System.out.println("Permutable");
    else System.out.println("Not Permutable");
  }





  }

}
