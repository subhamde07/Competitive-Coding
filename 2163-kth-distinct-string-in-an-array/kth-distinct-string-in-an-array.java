class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s, map.get(s)+1);
            }
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