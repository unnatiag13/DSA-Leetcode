class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans =0,i=0,sum=0;
        while(i<costs.length && sum+costs[i]<=coins){
            sum+=costs[i++]; 
            ans++;
        }
        return ans;
    }
}