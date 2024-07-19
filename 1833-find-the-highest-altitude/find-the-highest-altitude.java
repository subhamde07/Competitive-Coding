class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, maxe = 0;
        for(int i : gain){
            sum += i;
            maxe = Math.max(sum, maxe);
        }
        return maxe;
    }
}