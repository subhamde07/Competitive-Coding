class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefixStart = new int[n];
        int[] prefixEnd = new int[n];
        prefixStart[0] = nums[0];
        prefixEnd[n-1] = nums[n-1];
        
        for(int i=1 ; i<n; i++){
            prefixStart[i] = prefixStart[i-1] * nums[i];
            prefixEnd[n-i-1] = prefixEnd[n-i] * nums[n-i-1];
        }
        for(int i=0 ; i<nums.length ; i++){
            if(i == 0){
                ans[i] = prefixEnd[i+1];
            }
            else if(i == n-1){
                ans[i] = prefixStart[i-1];
            }
            else{
                ans[i] = prefixStart[i-1] * prefixEnd[i+1];
            }
        }
        
        return ans;
        
    }
}