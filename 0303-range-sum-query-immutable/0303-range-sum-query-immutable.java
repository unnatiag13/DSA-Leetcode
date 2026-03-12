class NumArray {
    int[] prefixSum;

    public NumArray(int[] nums) {
        int sum=0;
        prefixSum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixSum[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefixSum[right];
        }else{
            return prefixSum[right] - prefixSum[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */