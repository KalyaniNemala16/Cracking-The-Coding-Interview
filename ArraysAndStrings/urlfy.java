import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class urlfy{
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    int len  = Integer.parseInt(bf.readLine());
    char c[] = new char[str.length()];
    c = str.toCharArray();
    int i = len-1;
    int j = c.length-1;
    while(i>=0 && j>=0){
      if(c[i] != ' '){
        c[j] = c[i];
        i--; j--;
      }
      else{
        c[j] = '0';
        c[--j] = '2';
        c[--j] = '%';
        i--; j--;
      }
    }
    String  new_str = new String(c);
    System.out.println(new_str);
  }
}
