class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length)
            return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < target.length; i++) {
            map.merge(target[i], 1, Integer::sum);
            map.merge(arr[i], -1, Integer::sum);
        }

        return map.values().stream().allMatch(count -> count == 0);
    }
}