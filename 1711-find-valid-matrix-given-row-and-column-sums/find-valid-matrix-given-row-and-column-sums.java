class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numRows = rowSum.length;
        int numCols = colSum.length;
        int[][] matrix = new int[numRows][numCols];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // Fill the matrix with the minimum of the current rowSum and colSum
                int minSum = Math.min(rowSum[i], colSum[j]);
                matrix[i][j] = minSum;
                rowSum[i] -= minSum;
                colSum[j] -= minSum;
            }
        }
        return matrix;
    }
}