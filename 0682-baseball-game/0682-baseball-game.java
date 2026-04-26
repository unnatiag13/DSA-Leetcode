class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if("CD+".indexOf(operations[i])==-1){
                st.push(Integer.parseInt(operations[i]));
            }else if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else{
                int a = st.pop() , b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
        }
        int s =0;
        while(!st.isEmpty()){
            s+=st.pop();
        }
        return s;
    }
}