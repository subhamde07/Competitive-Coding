class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numRows = rowSum.length;
        int numCols = colSum.length;
        int[][] matrix = new int[numRows][numCols];
        int i = numRows-1 , j = numCols-1;
        
        while(i >= 0 && j >= 0){
            if(rowSum[i] <= colSum[j]){
                matrix[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i--;
            }
            else {
                matrix[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j--;
            }
        }
        return matrix;
    }
}