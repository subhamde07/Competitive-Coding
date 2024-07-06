class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        
        char[] chars = s.toCharArray();
        
        int i = 0, j = chars.length-1;
        while(i<j){
            if(st.contains(chars[i]) && st.contains(chars[j])){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;j--;
            }
            else if(st.contains(chars[i]) && !st.contains(chars[j])){
                j--;
            }
            else if(!st.contains(chars[i]) && st.contains(chars[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        
        return new String(chars);
    }
}