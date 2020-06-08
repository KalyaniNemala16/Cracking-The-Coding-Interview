public class palString{
public static boolean pal(String s){
int n = s.length();
int i=0; int j=n-1;
while(i<=n/2 && j>=n/2){
if(s.charAt(i) != s.charAt(j)){
return false;
}
i++;
j--;
}
return true;
}
public static void main(String args[]){
String str = new String("aa");
System.out.println(pal(str));
}
}
