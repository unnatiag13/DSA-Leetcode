class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i=n-1;
        while(i>=0 && digits[i]==9){
            digits[i--]=0;
        }
        if(i>=0){
            digits[i]++;
        }
        else{
            int[] arr= new int[n+1];
            // for(int i=n-1;i>=0;i--){
            //     arr[i]=digits[i];
            // }
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}