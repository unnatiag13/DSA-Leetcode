class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //ferequency map
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map.containsKey(i)&& map.get(i)>0){
                ans.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        } 
        return arr;
    }
}