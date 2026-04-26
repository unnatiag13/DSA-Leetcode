class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char a =s.charAt(i);
            if(!st.isEmpty() && a==st.peek()){
                st.pop();
            }else{
                st.push(a);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans = ans.reverse();
        return ans.toString();
    }
}