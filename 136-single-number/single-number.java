class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }

        return ans;

        // Using set -->
        // Set<Integer> set= new HashSet<>();
        // for(int num : nums)
        // {
        //     if(!set.add(num))
        //     {
        //         set.remove(num);
        //     }
        // }
        // Iterator<Integer> i = set.iterator();
        // return i.next();
    }
}