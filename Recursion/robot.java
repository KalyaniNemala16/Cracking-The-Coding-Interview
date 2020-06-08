import java.util.*;

public class robot {
  public int removeObstacles(int numRows, int numColumns, List<List<Integer>> lot) {
    if (numRows == 0 || numColumns == 0 || lot == null) {
      return -1;
    }
    if (lot.get(0).get(0) != 1) {
      return -1;
    }

    int[][] cache = new int[numRows][];
    for (int i=0; i<cache.length; i++) {
      cache[i] = new int[numColumns];
      Arrays.fill(cache[i], -1);
    }

    return recurse(0, 0, numRows, numColumns, lot, 0, cache);
  }

  private int recurse(int rpos, int cpos, int nr, int nc, List<List<Integer>> lot, int dist, int[][] cache) {
    if (lot.get(rpos).get(cpos) == 9) {
      // System.out.println("Grid Val: "+ lot.get(rpos).get(cpos));
      return dist;
    }

    if (cache[rpos][cpos] != -1) {
      return cache[rpos][cpos];
    }

    lot.get(rpos).set(cpos, -1);

    int minDist = Integer.MAX_VALUE;
    int newDist = dist + 1;

    // Recusively step into right
    if (canStepInto(rpos, cpos+1, nr, nc, lot)) {
      minDist = Math.min(minDist, recurse(rpos, cpos+1, nr, nc, lot, newDist, cache));
    }

    // Recursively step into left
    if (canStepInto(rpos, cpos-1, nr, nc, lot)) {
      minDist = Math.min(minDist, recurse(rpos, cpos-1, nr, nc, lot, newDist, cache));
    }
    // Recusrively step into top
    if (canStepInto(rpos-1, cpos, nr, nc, lot)) {
      minDist = Math.min(minDist, recurse(rpos-1, cpos, nr, nc, lot, newDist, cache));
    }
    // Recusively step into bottom
    if (canStepInto(rpos+1, cpos, nr, nc, lot)) {
      minDist = Math.min(minDist, recurse(rpos+1, cpos, nr, nc, lot, newDist, cache));
    }

    lot.get(rpos).set(cpos, 1);
    cache[rpos][cpos] = minDist;
    return minDist;
  }

  private boolean canStepInto(int rpos, int cpos, int nr, int nc, List<List<Integer>> lot) {
    // Is within grid bounds
    if (rpos >= nr || cpos >= nc || rpos <0 || cpos <0) {
      return false;
    }

    // Check value
    return lot.get(rpos).get(cpos) != 0 && lot.get(rpos).get(cpos) != -1;
  }

  public static void main(String[] args) {
    robot m = new robot();
    List<Integer> list1 = new ArrayList<>();
    list1.add(0);
    list1.add(0);
    list1.add(0);

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(0);
    list2.add(0);

    List<Integer> list3 = new ArrayList<>();
    list3.add(1);
    list3.add(9);
    list3.add(1);

    List<List<Integer>> lot = new ArrayList<>();
    lot.add(list1);
    lot.add(list2);
    lot.add(list3);

    System.out.println("Min Dist:" +m.removeObstacles(3, 3, lot));
  }
}
