class Solution {
    public int maximumGain(String s, int x, int y) {
        int aCount = 0;
        int bCount = 0;
        int mn = Math.min(x, y);
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                ans += Math.min(aCount, bCount) * mn;
                aCount = 0;
                bCount = 0;
            } else if (c == 'a') {
                if (x < y && bCount > 0) {
                    bCount--;
                    ans += y;
                } else {
                    aCount++;
                }
            } else {
                if (x > y && aCount > 0) {
                    aCount--;
                    ans += x;
                } else {
                    bCount++;
                };
            }
        }
        
        ans += Math.min(aCount, bCount) * mn;
        
        return ans;
    }
}