class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Using Brute Force ---> Time Complexity = O(n^2)
        
        // int[] ans = {-1};
        // for(int i=0 ; i<nums.length-1 ; i++){
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         if(target-nums[i] == nums[j]){
        //             ans =  new int[]{i , j};
        //             break;
        //         }
        //     }
        // }
        // return ans;
        
        
        
        // Using HashMap --->  Time Complexity = O(n)
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1};
        for (int i=0 ; i<nums.length ; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            } else {
                ans = new int[] {map.get(target - nums[i]), i};
            }
        }
        return ans;
        
    }
}