class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        st.push(nums2[0]);
        
        for(int i=1;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.get(nums1[i])!=null)
                ans[i] = map.get(nums1[i]);
            else
                ans[i] = -1;
        }
        return ans;
    }
}