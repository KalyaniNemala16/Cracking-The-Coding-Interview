import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsUniqueSol{

  public static boolean unique(String str){
    boolean[] c=new boolean[128];
    for(int i=0;i<str.length();i++){
      int val=str.charAt(i);
      if(c[val])
      return false;
      c[val]=true;
    }
    return true;
  }

  public static void main(String[] args) throws IOException{
    System.out.println("Enter string:");
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String s=bf.readLine();
    boolean x=unique(s);
    if(x)
    {System.out.println("Distinct");}
    else
    System.out.println("Not Distinct");



  }
}
