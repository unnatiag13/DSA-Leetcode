class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty())
            ans= st.pop() + ans;
        return ans;
    }
}