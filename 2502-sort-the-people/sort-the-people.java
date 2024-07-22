class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        int n = names.length;

        for(int i=0 ; i<n ; i++){
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        String ans[] = new String[n];
        for(int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = map.get(heights[i]);
        }
        return ans;
    }
}