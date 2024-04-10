class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) 
            return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0 ; i<s.length() ; i++){
            Character k = s.charAt(i), v = t.charAt(i);
            if(!map.containsKey(k)){
                if(!map.containsValue(v)){
                    map.put(k, v);
                } else {
                    return false;
                }
            } else{
                if(v != map.get(k)) {
                    return false;
                }
            }
        }
        return true;
    }
}