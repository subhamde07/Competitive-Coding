class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        // First Solution
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        */
        
        // Second Solution
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
        
    }
}