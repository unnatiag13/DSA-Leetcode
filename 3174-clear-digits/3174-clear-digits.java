class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isLetter(a)) st.push(a);
            else if(!st.isEmpty()) st.pop();
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

    }
}