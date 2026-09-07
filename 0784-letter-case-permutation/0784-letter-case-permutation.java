class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        solve(0,s.toCharArray(),ans);
        return ans;
    }
    public void solve(int idx , char[] arr, List<String> ans){
        if(idx==arr.length){
            ans.add(new String(arr));
            return ;
        }
        if(Character.isDigit(arr[idx])){
            solve(idx+1,arr,ans);
            return;
        }
        arr[idx] = Character.toUpperCase(arr[idx]);
        solve(idx+1,arr,ans);
        arr[idx] = Character.toLowerCase(arr[idx]);
        solve(idx+1,arr,ans);
    }
}