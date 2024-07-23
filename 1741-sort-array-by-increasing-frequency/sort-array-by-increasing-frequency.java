class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }

        List<Integer> li = new ArrayList<>(map.keySet());
        Collections.sort(li, (a, b) -> {
            if(map.get(a) == map.get(b))
                return b - a;
            else
                return map.get(a) - map.get(b);
        });

        // int[] result = new int[nums.length];
        int index = 0;
        for(int num : li){
            for(int i = 0 ; i < map.get(num) ; i++){
                nums[index++] = num;
            }
        }
        return nums;
    }
}