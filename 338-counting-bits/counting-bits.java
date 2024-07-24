class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[]{0};
        }
        int[] ans = new int[n+1];
        // ans[0] = 0;
        // for(int i=1 ; i<=n ; i++){
        //     if(i % 2 == 0)
        //         ans[i] = ans[i/2];
        //     else
        //         ans[i] = ans[i/2] + 1;
        // }
        // return ans;

        // Using Bit
        for(int i=1 ; i<=n ; i++){
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}