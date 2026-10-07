class Solution {
    Set<String> ans = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int leftRemove = 0;
        int rightRemove = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                leftRemove++;
            }
            else if(ch == ')') {
                if(leftRemove > 0) {
                    leftRemove--;
                } else {
                    rightRemove++;
                }
            }
        }
        backtrack(s,0,0,0,leftRemove,rightRemove,new StringBuilder());
        return new ArrayList<>(ans);
    }

    private void backtrack(String s,int idx,int leftCount,int rightCount,int leftRemove,int rightRemove,StringBuilder curr) {
        if(idx == s.length()) {
            if(leftRemove == 0 && rightRemove == 0) {
                ans.add(curr.toString());
            }
            return;
        }

        char ch = s.charAt(idx);
        int len = curr.length();
        if(ch == '(') {
            // remove
            if(leftRemove > 0) {
                backtrack(s,idx+1,leftCount,rightCount,leftRemove-1,rightRemove,curr);
            }
            // keep
            curr.append(ch);
            backtrack(s,idx+1,leftCount+1,rightCount,leftRemove,rightRemove,curr);
            curr.setLength(len);
        }
        else if(ch == ')') {
            // remove
            if(rightRemove > 0) {
                backtrack(s,idx + 1,leftCount,rightCount,leftRemove,rightRemove - 1,curr);
            }
            // keep
            if(rightCount < leftCount) {
                curr.append(ch);
                backtrack(s,idx+1,leftCount,rightCount+1,leftRemove,rightRemove,curr);
                curr.setLength(len);
            }
        }
        else {
            curr.append(ch);
            backtrack(s,idx + 1,leftCount,rightCount,leftRemove,rightRemove,curr);
            curr.setLength(len);
        }
    }
}
