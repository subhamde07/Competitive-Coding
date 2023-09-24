class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};
        int i = 0, j = n-1;
        while(i<=j){
            if(ans[0] != -1 && ans[1] != -1){
                return ans;
            }
            if(nums[i] == target && ans[0] == -1){
                ans[0] = i;
            }
            if(nums[j] == target && ans[1] == -1){
                ans[1] = j;
            }
            if(ans[0] == -1){
                i++;
            }
            if(ans[1] == -1){
                j--;
            }
        }
        return ans;
    }
}