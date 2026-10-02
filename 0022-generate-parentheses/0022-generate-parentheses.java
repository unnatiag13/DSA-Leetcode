class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        solve(n,0,0,new StringBuilder(""),ll);
        return ll;
    }
    public static void solve(int n,int open, int close,StringBuilder ans,List<String> ll){
        if(open==n && close==n){
            ll.add(ans.toString());
            return;
        }
        if(open<n){
            solve(n,open+1,close,ans.append("("),ll);
            ans.deleteCharAt(ans.length() - 1);
        }
        if(open>close){
            solve(n,open,close+1,ans.append(")"),ll);
            ans.deleteCharAt(ans.length() - 1);
        }
    }
}