class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(!st.isEmpty() && a=='#') st.pop();
            else if(a!='#'){
                st.push(a);
            }
        }
        for(int i=0;i<t.length();i++){
            char a = t.charAt(i);
            if(!st2.isEmpty() && a=='#') st2.pop();
            else if(a!='#'){
                st2.push(a);
            }
        }
        return st.equals(st2);
    }
}