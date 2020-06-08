import java.util.*;
public class RobotInGrid{
  public ArrayList<ArrayList<Integer>> robotPath(int[][] grid){
    ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
    if(grid == null || grid.length == 0) return path;
    robotPath(grid,0,0,path);
    return path;
  }

  public boolean robotPath(int[][] grid, int i, int j, ArrayList<ArrayList<Integer>> path){
    ArrayList<Integer> cell = new ArrayList<Integer>();
    int row = grid.length;
    int col = grid[i].length;
    if(i == row-1 && j == col-1){
      cell.add(i);
      cell.add(j);
      path.add(cell);
      return true;
    }
    if(grid[i][j] == 0 || i >= row || j >= col){
      return false;
    }
    boolean right = false;
    boolean down = false;
    if(i+1<row && grid[i+1][j]!=0){
      down  = robotPath(grid,i+1,j,path);
      if(down){
        cell.add(i);
        cell.add(j);
        path.add(cell);
      }

    }
    if(j+1<col && grid[i][j+1]!=0){
      right = robotPath(grid,i,j+1,path);
      if(right){
        cell.add(i);
        cell.add(j);
        path.add(cell);
      }

    }
    return down || right;
  }

  public static void main(String args[]){
    int[][] grid = new int[][]
    {
      {1,1,0},
      {1,0,1},
      {1,1,1},
      {1,0,1}
    };
    RobotInGrid r = new RobotInGrid();
    System.out.println(r.robotPath(grid));
  }
}
