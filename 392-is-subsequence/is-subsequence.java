class Solution {
    public boolean isSubsequence(String s, String t) {

        
        int i = 0, j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;j++;
            }
            else j++;
        }
        if(i == s.length()){
            return true;
        }
        return false;
        

        // Follow-up ans --->
        // HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // int sl = s.length(), tl = t.length();
        // for(int i=0 ; i<tl ; i++){
        //     if(map.containsKey(t.charAt(i))){
        //         map.get(t.charAt(i)).add(i);
        //     }
        //     else{
        //         ArrayList<Integer> list = new ArrayList<>();
        //         list.add(i);
        //         map.put(t.charAt(i), list);
        //     }
        // }
        
        // int prev = -1;
        // for(char ch : s.toCharArray()){
        //     if(!map.containsKey(ch))
        //         return false;
        //     ArrayList<Integer> indus = map.get(ch);
        //     int pt = upperBound(indus, prev);
            
            
        // }


    }
    // public int upperBound(ArrayList<Integer> arr, int key) {
    //     int index = Arrays.binarySearch(arr, key);
    //     return index >= 0 ? index + 1 : arr.length;
    // }

}