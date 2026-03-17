class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String c: tokens){
            if(!c.equals("+") &&!c.equals("-") && !c.equals("/") && !c.equals("*")){
                st.push(Integer.parseInt(c));
            }else{
                int op2 =st.pop(); 
                int op1 =st.pop();
                if(c .equals("+")) st.push( op2+op1); 
                else if(c .equals("-")) st.push( op1 - op2); 
                else if(c .equals("*")) st.push( op2*op1); 
                else if(c .equals("/")) st.push( op1/op2); 
            }
        }
        return st.pop();
    }
}