class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ans =0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push('(');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    ans++;
                }
            }
        }
        while(!st.isEmpty()){
            ans++;
            st.pop();
        }
        return ans;

    }
}