class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        comb(candidates,target,0,ll,ans);
        return ans;
    }
    public static void comb(int[] coins,int amount,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coins.length;i++){
            if(amount>=coins[i]){
                ll.add(coins[i]);
                comb(coins,amount-coins[i],i,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}