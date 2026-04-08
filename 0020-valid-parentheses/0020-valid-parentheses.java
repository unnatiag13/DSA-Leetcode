class Solution {
    public boolean isValid(String s) {
       if(s.length()%2!=0) return false;
       Stack<Character> st = new Stack<>();
       for(char c:s.toCharArray()){
        if(c=='(' || c== '{' || c=='['){
            st.push(c);
        }
        else{
            char d = st.peek();
            if(d=='(' && c!=')' || d=='{' && c!='}' || d=='[' && c!=']' ){
                return false;
            }else{
                st.pop();
            }
        }
       }
       return st.isEmpty();
    }
}