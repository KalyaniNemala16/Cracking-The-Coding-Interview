public class uniqueChar{
public static boolean unique(String s){
if(s.isEmpty()) return false;
if(s.length() == 1) return true;
for(int i = 0 ; i<s.length()-1 ; i++){
  int j = i+1;
  while(j<s.length())
  {
    if(s.charAt(j) == s.charAt(i)) return false;
    j++;
  }
}
return true;
}
public static void main(String args[]){
if(unique("abcd"))
System.out.println("Has all unique characters");
else
System.out.println("Does not have all unique characters");
}
}
