import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class zeroMatrix{

  static int[][] check(int[][] m){
    boolean rowZ = false;
    boolean colZ = false;
    //checking in 1st col if there is a zero
    for(int i=0 ; i<m.length ; i++){
      if(m[0][i] == 0){
        colZ = true;
        break;
      }
    }
    //checking in 2nd row if there is a zero
    for(int j=0 ; j<m[0].length ; j++){
      if(m[j][0] == 0){
        rowZ = true;
         break;
      }
    }

    //checking in the remianing matrix
    for(int i=1 ; i<m.length ; i++){
      for(int j=1 ; j<m[0].length ; j++){
        if(m[i][j] == 0){
          m[i][0] = 0;
          m[0][j] = 0;
        }
      }
    }

    //setting the row which has a 0 in the 1st col to 0
    for(int i=1 ; i<m.length ; i++){
      if(m[i][0] == 0){
        nullifyRow(m, i);
      }
    }

    //setting the col which has a 0 in the 1st row to 0
    for(int j=1 ; j<m[0].length ; j++ ){
      if(m[0][j] == 0){
        nullifyCol(m ,j);
      }
    }

    //checking the 1st row if it has any zero's in the beginning before adding new 0's
    if(rowZ){
      nullifyRow(m, 0);
    }
    if(colZ){
      nullifyCol(m, 0);
    }


    return m;
  }

  static void nullifyRow(int[][] m, int i){
    for(int k=0 ; k<m[0].length ; k++){
      m[i][k] = 0;
    }
  }
  static void nullifyCol(int[][] m , int j){
    for(int k=0 ; k<m.length ; k++){
      m[k][j] = 0;
    }
  }

  public static void main(String args[]) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter rows and cols");
    int r = Integer.parseInt(bf.readLine());
    int c = Integer.parseInt(bf.readLine());
    int[][] matrix = new int[r][c];
    System.out.println("Enter values into matrix");
    for(int i=0 ; i<r ; i++ ){
      for(int j=0 ; j<c ; j++){
        matrix[i][j] = Integer.parseInt(bf.readLine());
      }
    }
    check(matrix);
    for(int i=0 ; i<r ; i++){
      for(int j=0 ; j<c ; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
        }
  }
}
