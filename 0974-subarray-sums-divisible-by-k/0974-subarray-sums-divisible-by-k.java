class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // prefix sum array
        // two pointer a from left and b from right in prefix sum
        // (b-a)%k==0
        // (b%k) - (a%k) ==0
        // b%k == a%k
        // mod of whole prefix arrray
        // and then prepare a freq hashmap and do nC2 formula
        // CATCH : neg values can also be there
        // we will take positive mod of neg values
        // e.g -4 % 5 = -4
        // soln : -4 % 5 = (-4 + 5) = 1 which is positive rem of -4 %5

        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum= (sum + nums[i]) %k;
            if(sum<0) sum+=k;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }//(4,3),()
        int cnt =0;
        for(int key:map.keySet()){
            int n = map.get(key);
            if(n>=2) cnt += (n*(n-1))/2;
        }
        return cnt;
    }
}