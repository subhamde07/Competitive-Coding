class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == ')'){
                Queue<Character> q = new LinkedList<>();
                while(st.peek() != '('){
                    q.add(st.pop());
                }
                st.pop();
                while(q.size() > 0){
                    st.push(q.remove());
                }
            }
            else{
                st.push(c);
            }
        }

        char[] ans = new char[st.size()];
        int i = ans.length-1;
        while(i >= 0){
            ans[i] = st.pop();
            i--;
        }

        return new String(ans);
    }
}