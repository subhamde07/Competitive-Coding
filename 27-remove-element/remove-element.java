class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0 ,j = 0;
        while(i < nums.length){
            if(nums[i++] != val){
                nums[j++] = nums[i-1]; // when statement = true and Enter in if block, i increase, so that num[i-1]
            }
        }
        
        return j;
    }
}