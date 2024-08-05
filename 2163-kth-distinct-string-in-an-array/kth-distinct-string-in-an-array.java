class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr){
            map.merge(s, 1, Integer::sum);
        }
        int count = 0;
        for (var entry : map.entrySet()){
            if(entry.getValue() == 1){
                count++;
            }
            if(count == k){
                return entry.getKey();
            }
        }
        return "";
    }
}