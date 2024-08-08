class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int count = 0;
        
        // Directions: right, down, left, up
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int direction = 0; // start direction: right
        int step = 1; // number of steps in current leg of spiral
        
        int r = rStart, c = cStart;
        result[count++] = new int[]{r, c};
        
        while (count < rows * cols) {
            for (int i = 0; i < 2; i++) { // there are two legs in each complete layer of spiral
                for (int j = 0; j < step; j++) {
                    r += dr[direction];
                    c += dc[direction];
                    
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};
                    }
                }
                direction = (direction + 1) % 4; // change direction
            }
            step++; // increase step after each full layer
        }
        
        return result;

    }
}