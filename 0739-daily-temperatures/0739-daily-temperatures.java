class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                ans[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}