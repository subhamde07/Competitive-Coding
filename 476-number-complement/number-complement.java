class Solution {
    public int findComplement(int num) {
        if(num == 1) return 0;

        String comp = Integer.toBinaryString(num);
        int ans = 0;
        int power = comp.length() - 1;
        for(char c : comp.toCharArray()){
            int digit = Character.getNumericValue(c);
            if(digit == 0){
                ans += 1 * Math.pow(2, power);
                power--;
            } else{
                ans += 0 * Math.pow(2, power);
                power--;
            }
        }
        return ans;
    }
}