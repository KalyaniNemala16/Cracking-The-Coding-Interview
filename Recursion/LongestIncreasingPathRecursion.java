class LongestIncreasingPathRecursion {
	public int longestIncreasingPath(int[][] matrix) {
    int rows = matrix.length;
    int maxLen = Integer.MIN_VALUE;

    // Consider every cell in the grid and obtain max len starting at this cell
    // update maxLen with the maximum of obtained len and maxLen
    for (int rpos = 0; rpos < rows; rpos++) {
      for (int cpos = 0; cpos < matrix[rpos].length; cpos++) {
        maxLen = Math.max(maxLen, glp(matrix, rows, rpos, cpos));
      }
    }

    return maxLen;
  }

  private int glp(int[][] matrix, int rows, int rpos, int cpos) {
    int currentVal = matrix[rpos][cpos];
    int maxLenFromCurrentCell = 1;

    // Recurse top
    if (canStepInto(matrix, rpos-1, cpos, rows, matrix[rpos].length, currentVal)) {
      maxLenFromCurrentCell = Math.max(maxLenFromCurrentCell, 1+glp(matrix, rows, rpos-1, cpos));
    }

    // Recurse bottom
    if (canStepInto(matrix, rpos+1, cpos, rows, matrix[rpos].length, currentVal)) {
      maxLenFromCurrentCell = Math.max(maxLenFromCurrentCell, 1+glp(matrix, rows, rpos+1, cpos));
    }

    // Recurse left
    if (canStepInto(matrix, rpos, cpos-1, rows, matrix[rpos].length, currentVal)) {
      maxLenFromCurrentCell = Math.max(maxLenFromCurrentCell, 1+glp(matrix, rows, rpos, cpos-1));
    }

    // Recurse right
    if (canStepInto(matrix, rpos, cpos+1, rows, matrix[rpos].length, currentVal)) {
      maxLenFromCurrentCell = Math.max(maxLenFromCurrentCell, 1+glp(matrix, rows, rpos, cpos+1));
    }

    return maxLenFromCurrentCell;
  }

  private boolean canStepInto(int[][] matrix, int rpos, int cpos, int rows, int columns, int prevValue) {

    // Check bounds and value
    return !( rpos >= rows || cpos >= columns || rpos < 0 || cpos < 0 || prevValue - matrix[rpos][cpos] >= 0);
  }
}