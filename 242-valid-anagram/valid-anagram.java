
class Solution {
    public HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            Character ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = makeFreqMap(s);
        HashMap<Character, Integer> map2 = makeFreqMap(t);
        return map1.equals(map2);
    }
}