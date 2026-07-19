class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n =numbers.length;
        int a = 0; int b = n-1;
        while(a!=b){
            if(numbers[a]+numbers[b]==target){
                ans[0] = a+1;
                ans[1] = b+1;
                break;
            }else if(numbers[a]+numbers[b]>target) b--;
            else if(numbers[a]+numbers[b]<target) a++;
        }
        return ans;
    }
}