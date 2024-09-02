class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int n : chalk) {
            totalChalk += n;
        }
        
        int remainingChalk = (int)(k % totalChalk);
        
        for (int i = 0; i < chalk.length; i++) {
            if (remainingChalk < chalk[i]) {
                return i;
            }
            remainingChalk -= chalk[i];
        }
        
        return 0;  
    }
}