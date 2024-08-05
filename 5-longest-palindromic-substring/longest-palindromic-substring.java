class Solution {
    boolean isPalindrom(String s, int st, int end){
        if(st >= end){
            return true;
        }

        if(s.charAt(st) == s.charAt(end)){
            return isPalindrom(s, st+1, end-1);
        }
        return false;
    }

    public String longestPalindrome(String s) {
        int maxCount = 0;
        int start = 0;
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i ; j<s.length() ; j++){
                if(isPalindrom(s, i, j)){
                    if(j-i+1 > maxCount){
                        maxCount = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxCount);
    }
}