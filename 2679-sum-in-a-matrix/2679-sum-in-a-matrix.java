class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m =nums[0].length;
        int fsum=0;

        for(int[] row:nums){
            Arrays.sort(row);
        }

        for(int i=0;i<m;i++){
            int max=nums[0][i];
            for(int j=0;j<n;j++){
                if(nums[j][i]>max) max =nums[j][i];
            }
            fsum+=max;
        }
        return fsum;
    }
}