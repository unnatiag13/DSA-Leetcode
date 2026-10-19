class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lesser =0;
        int equal =0;
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            if(i<target)lesser++;
            else if(i==target) equal++;
        }
        for(int i=0;i<equal;i++){
            ans.add(i+lesser);
        }
        return ans;
    }
}