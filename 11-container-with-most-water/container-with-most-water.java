class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        long amount = 0;

        while(i < j){
            // amount = Math.max(amount, Math.min(height[i], height[j]) * (j-i));
            if(height[i] < height[j]){
                amount = Math.max(amount, height[i] * (j - i));
                i++;
            } else {
                amount = Math.max(amount, height[j] * (j - i));
                j--;
            }        
        }
        return (int)amount;
    }
}