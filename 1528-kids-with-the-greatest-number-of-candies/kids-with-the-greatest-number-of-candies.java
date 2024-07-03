class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ansList = new ArrayList<Boolean>();
        
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            if(i > max)
                max = i;
        }
        
        for(int i : candies){
            if(i + extraCandies >= max){
                ansList.add(true);
            } else{
                ansList.add(false);
            }
        }
        
        return ansList;
    }
}