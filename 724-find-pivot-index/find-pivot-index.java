class Solution {
    public int pivotIndex(int[] nums) {
        // Best RunTime
        /*
        if (nums.length == 0) return -1;

        int leftSum = 0, rightSum = 0;
        for (int num : nums)
            rightSum += num;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
        */

        // Other Approach For Best Memory Management

        int l = nums.length;
        int[] leftPrefix = new int[l];
        int[] rightPrefix = new int[l];
        leftPrefix[0] = nums[0];
        rightPrefix[l-1] = nums[l-1];

        for(int i = 1; i < l; i++) {
            leftPrefix[i] = leftPrefix[i-1] + nums[i];
            rightPrefix[l-1-i] = rightPrefix[l-i] + nums[l-1-i];
        }
        int i = 0;
        while(leftPrefix[i] != rightPrefix[i]) {
            i++;
            if (i == l) return -1;
        }

        System.gc();
        return i;
    }
}