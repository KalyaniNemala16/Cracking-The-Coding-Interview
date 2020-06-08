import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class urloptimize{
  static void url(char[] c,int trueLength){
    int count=0;
    int i=0;
    int size=0;
    for(i=0;i<size;i++){
      if(c[i]==' ')
      count++;
    }
    size=trueLength+count*2;
    if(trueLength<c.length) c[trueLength]='\0';
    for(i=trueLength-1;i>=0;i--){
      if(c[i]==' '){
        c[size-1]='0';
        c[size-2]='2';
        c[size-3]='%';
        size=size-3;

      }
      else{
        c[size-1]=c[i];
        size--;
      }
    }
    String str2=new String(c);
    System.out.println(str2);
  }

  public static void main(String args[]) throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String str=bf.readLine();
    int num=Integer.parseInt(bf.readLine());
    char c[]=str.toCharArray();
    url(c,num);

  }
}
