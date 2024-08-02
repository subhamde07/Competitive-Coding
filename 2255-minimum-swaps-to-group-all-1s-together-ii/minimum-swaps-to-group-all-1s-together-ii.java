class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOne = IntStream.of(nums).sum();

        int i = 0, j = 0;
        int currOne = 0;
        int maxCount = 0;
        while(j < 2*n){
            if(nums[j % n] == 1){
                currOne++;
            }
            if(j - i + 1 > totalOne){
                currOne -= nums[i % n];
                i++;
            }
            maxCount = Math.max(currOne, maxCount);
            j++;
        }
        return totalOne - maxCount;
    }
}