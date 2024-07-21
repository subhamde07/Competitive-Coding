class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            set2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(var i : set1){
            if(!set2.contains(i))
                l1.add(i);
        }
        for(var i : set2){
            if(!set1.contains(i))
                l2.add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);

        return ans;

    }
}