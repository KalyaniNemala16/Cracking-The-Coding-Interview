import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class palpermOpt{

  static boolean pal(String str){
    int [] table = createTable(str);
    return checkOdd(table);
  }

  static int[] createTable(String str){
    int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
    for(char c : str.toCharArray()){
      int x = getValue(c);
      if(x!=-1){
        table[x]++;
      }
    }
    return table;
  }

  static int getValue(Character c){
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if(a <= val && val <= z){
      return val-a;
    }
    return -1;
  }

  static boolean checkOdd(int[] table){
    boolean odd=false;
    for(int count : table){
      if(count%2 == 1){
        if(odd)
        {return false;}
        odd=true;
      }
    }
    return true;
  }


  public static void main(String args[]) throws IOException{
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  String str = bf.readLine();
  str = str.toLowerCase();
  System.out.println(str);
  if(pal(str)){
    System.out.println("true");
  }
  else
  System.out.println("false");
  }
}
