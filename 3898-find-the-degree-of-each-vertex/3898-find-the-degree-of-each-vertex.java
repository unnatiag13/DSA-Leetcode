class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] deg = new int[n];
        for(int i=0;i<n;i++){
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) {
                    deg[j]++;
                }
            }
        }
        return deg;
    }
}