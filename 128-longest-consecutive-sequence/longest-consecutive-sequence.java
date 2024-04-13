class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        
        int maxLen = 0;
        for(int n : set){
            if(!set.contains(n - 1)){
                int currNum = n;
                int currLen = 1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}