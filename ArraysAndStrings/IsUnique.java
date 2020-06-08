import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IsUnique{
  public static void main(String[] args) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input the string:");
    String s= bf.readLine();
    char[] c=s.toCharArray();
    int count=0;
    a:
    for(int i=0;i<c.length;i++){
      b:
      for(int j=i+1;j<c.length;j++){
        if(c[i]==c[j])
        {
        count=0;
        System.out.println("String does not have all unique characters.");  break a;
      }
      else count++;
      }
    }

    if(count!=0)
    {System.out.println("The string has all unique characters");}
  }
}
