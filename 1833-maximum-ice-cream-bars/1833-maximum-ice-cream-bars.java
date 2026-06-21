class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int min=costs[0],max = costs[0];
        for(int i:costs){
            if(i<min) min=i;
            if(max<i) max = i;
        }
        int[] countOccurences = new int[max+1];
        for(int i=0;i<costs.length;i++){
            countOccurences[costs[i]]++;
        }
        for(int i=1;i<countOccurences.length;i++){
            countOccurences[i] += countOccurences[i-1];
        }
        int[] sorted = new int[costs.length];
        for(int i=costs.length-1;i>=0;i--){
            int val = costs[i];
            int pos = countOccurences[val]-1;
            sorted[pos] = val;
            countOccurences[val]--;
        }
        int ans =0,i=0,sum=0;
        while(i<sorted.length && sum+sorted[i]<=coins){
            sum+=sorted[i++]; 
            ans++;
        }
        return ans;
    }
}