class Solution {
    public void subset(int idx,List<Integer> sublist,List<List<Integer>> ans ,int[] nums){
        if(idx>= nums.length){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[idx]);
        subset(idx+1,sublist,ans,nums);
        sublist.remove(sublist.size()-1);
        subset(idx+1,sublist,ans,nums);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,new ArrayList<>(),ans,nums);
        return ans;
    }
}