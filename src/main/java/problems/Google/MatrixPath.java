package problems.Google;

/**
 * Google Interview Question
 *
 * Take a 2d array as input, array has 1's and 0's. Return
 * true if there's a path of 1's from the top row to the bottom row
 *
 * Notes: up/down/left/right no diagonal
 */
public class MatrixPath {
    private int[][] matrix;
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public MatrixPath(int [][] matrix, int startX, int startY, int endX, int endY) {
        this.matrix = matrix;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    /**
     * We want to take advantage of DFS to look
     * through the 1's to find a path from top left corner
     * to bottom left corner.
     * @return
     */
    public boolean isPath() {
        return dfs(startX, startY);
    }

    private boolean dfs(int x, int y) {
        if (matrix[x][y] == 0) {
            return false;
        } else if (x == endX && y == endY){
            return true;
        } else {
            boolean result = false;
            // mark as visited
            matrix[x][y] = 0;
            if (x + 1 < matrix.length) {
                result |= dfs(x+1, y);
            }
            if (x - 1 >= 0) {
                result |= dfs(x-1, y);
            }
            if (y + 1 < matrix[0].length) {
                result |= dfs(x, y+1);
            }
            if (y - 1 >= 0) {
                result |= dfs(x, y-1);
            }
            return result;
        }

    }
}
