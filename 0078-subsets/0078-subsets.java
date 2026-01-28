class Solution {
    public static void printSubset(int[] arr,int i,List<Integer> ans, List<List<Integer>> allSubsets){
        if(i==arr.length){
            allSubsets.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[i]);
        printSubset(arr,i+1,ans,allSubsets);
        ans.remove(ans.size()-1);
        printSubset(arr,i+1,ans,allSubsets);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        printSubset(nums,0,ans,allSubsets);
        return allSubsets;
    }
}