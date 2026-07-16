class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;

        if(n==0 && m==0) return 0;

        if(n==0){
            if(m %2==0){
                double ans = nums2[m/2 - 1] + nums2[m/2];
                return ans/2.0;
            }else{
                double ans = nums2[m/2];
                return ans;
            }
        }else if(m==0){
            if(n%2==0){
                double ans = nums1[n/2 - 1] + nums1[n/2];
                return ans/2.0;
            }else{
                double ans = nums1[n/2];
                return ans;
            }
        }
        int[] arr = new int[n + m]; 
        int a=0, b=0;
        int c =0;

        while(a<n && b<m){
            if(nums1[a]< nums2[b]){
                arr[c++] = nums1[a++];
            }else{
                arr[c++] = nums2[b++];
            }
        }
        while(b<m){
            arr[c++] = nums2[b++];
        }
        while(a<n){
            arr[c++] = nums1[a++];
        }
        if(arr.length % 2==0){
            double ans = arr[arr.length/2 - 1] + arr[arr.length/2];
            return ans/2.0;
        }else{
            double ans = arr[arr.length/2];
            return ans;
        }
    }
}