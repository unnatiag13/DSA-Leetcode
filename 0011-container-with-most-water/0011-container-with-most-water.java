class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length -1;
        int maxContain =0;
        while(i<j){
            maxContain = Math.max(maxContain, 
             Math.min(height[i],height[j])*(j-i));

             if(height[i]<height[j]){
                i++;
             }else{ j--;}
        }
        return maxContain;
    }
}