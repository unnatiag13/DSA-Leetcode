class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> curr,
                           List<List<Integer>> ans, boolean[] used) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, curr, ans, used);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}