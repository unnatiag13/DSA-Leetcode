class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        boolean[] isAdded = new boolean[nums.length];
        permutations(nums,ll,ans,isAdded);
        return ans;
    }
    public static void permutations(int[] nums,List<Integer> ll,List<List<Integer>> ans,boolean[] isAdded ){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!isAdded[i]){
                isAdded[i] = true;
                ll.add(nums[i]);
                permutations(nums,ll,ans,isAdded);
                isAdded[i] = false;
                ll.remove(ll.size()-1);
            }
        }
    }


}