class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum =0,rsum =0;
        int maxSum =0;
        for(int i=0;i<k;i++) lsum += cardPoints[i];
        maxSum = lsum;
        for(int i=0;i<k;i++){
            lsum -= cardPoints[k-i-1];
            rsum += cardPoints[n-i-1];
            maxSum = Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}