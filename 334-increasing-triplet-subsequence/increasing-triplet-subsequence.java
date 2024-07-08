class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2){
            return false;
        }
        
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int pt=0 ; pt<nums.length ; pt++){
            if(nums[pt] <= i) i = nums[pt];
            else if(nums[pt] <= j) j = nums[pt];
            else return true;
            
        }
        return false;
    }
}