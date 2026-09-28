class Solution {
    public int maxDepth(String s) {
        int currDepth=0,maxDepth=0;
        Stack<Integer> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                currDepth++;
                maxDepth =Math.max(currDepth,maxDepth);
            }else if(c==')'){
                currDepth--;
            }
        }
        return maxDepth;
    }
}