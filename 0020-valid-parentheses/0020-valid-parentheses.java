class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        boolean isValid = true;
        Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray()){

            if(c=='(' || c== '[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;

                char top = st.pop();

               if((top=='(' && c!=')') || 
                (top=='{' && c !='}')||( top=='[' && c != ']' ))return false;
            }
        }
        return st.isEmpty();
    }
}