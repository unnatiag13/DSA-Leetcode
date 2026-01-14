class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr =new int[2];
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int ele = target-nums[i];
            if(map.containsKey(ele)){
                arr[0] = i;
                arr[1] = map.get(ele);
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}