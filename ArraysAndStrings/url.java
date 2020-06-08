import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class url{
public static void main(String args[]) throws IOException
{
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter String:");
  String str1=bf.readLine();
  char c[]=str1.toCharArray();
  int count=0;
  for(int i=0;i<str1.length();i++){
    if(c[i]==' ')
    {count++;}
  }
  if(count>0){
  int size=(count*2)+str1.length();
  char b[]=new char[size];
  int i=0,j=0;
  while(i<str1.length()||j<size){
    if(c[i]!=' '){
      b[j]=c[i];
      i++; j++;
    }
    else{
      b[j]='%';
      b[++j]='2';
      b[++j]='0';
      i++; j++;
    }

  }
String str2=new String(b);
System.out.println(b);
}
else{
  System.out.println(str1);
}
}

}
