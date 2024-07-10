class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        if( n == 1) return 0;

        long totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        long leftSum = 0, minDiff = Integer.MAX_VALUE, index=-1;
        for(int i=0 ; i<n ; i++){
            leftSum += nums[i];
            long leftAvg = leftSum / (i+1);
            long rightAvg = (totalSum - leftSum);
            if(i != n-1)
                rightAvg /= (n-1-i);
            long currDiff = (int)Math.abs(leftAvg - rightAvg);
            if(currDiff < minDiff){
                index = i;
                minDiff = currDiff;
            }
        }

        return (int)index;
    }
}