class Solution {
    public void reverse(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }



    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<n;i++){
            reverse(image[i]);
            for(int j=0;j<m;j++){
                image[i][j] = image[i][j]^1;
            }
        }
        return image;
    }
}