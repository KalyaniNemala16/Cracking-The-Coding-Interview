import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class rotateMatrix{
  static int[][] rotate(int[][] m){
    int n = m.length;
    for(int layer=0 ; layer<n/2 ; layer++){
      int first = layer;
      int last = n-1-layer;

      for(int i=first ; i<last; i++){
        int offset = i-first;
        int top = m[first][i];
        m[first][i] = m[last-offset][first];
        m[last-offset][first] = m[last][last-offset];
        m[last][last-offset] = m[i][last];
        m[i][last] = top;
      }
    }
    return m;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Give rows and columns size: ");
    int r = Integer.parseInt(bf.readLine());
    int c = Integer.parseInt(bf.readLine());
    int a[][] = new int[r][c];


    if(a.length==0 || a.length!=a[1].length){
      System.out.println("Give N*N matrix");
    }
    else{
      System.out.println("Enter values: ");
      for(int i=0 ; i<r ; i++){
        for(int j=0 ; j<c ; j++){
          a[i][j] = Integer.parseInt(bf.readLine());
        }
      }
      
      rotate(a);
      for(int i=0 ; i<r ; i++){
        for(int j=0 ; j<c ; j++){
          System.out.print(a[i][j]);
        }
        System.out.println();
      }
    }

  }
}
