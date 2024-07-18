class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        
        int i = 1;
        int index = 1;
        sb.append(chars[0]);
        
        while(i < chars.length){
            if(chars[i] == chars[i-1]){
                index++;
            }
            else{
                if(index > 1)
                    sb.append(index);
                sb.append(chars[i]);
                index = 1;
            }
            i++;
        }
        if(index > 1) sb.append(index);
        for(int j = 0 ; j < sb.length() ; j++)
            chars[j] = sb.charAt(j);
        
        return sb.length();
    }
}