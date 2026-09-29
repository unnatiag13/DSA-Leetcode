class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                high=high-1;
                low=low+1;
                continue;
            }
            // figure out the sorted half
            if(arr[low]<=arr[mid]){
                if(target<arr[mid] && target>=arr[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target>arr[mid] && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}