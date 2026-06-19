class Solution {
    public int largestAltitude(int[] gain) {
        int max_altitude = 0;
        for(int i=0;i<gain.length;i++){
            if(i>0) gain[i]+=gain[i-1]; 
            if(gain[i]>max_altitude) max_altitude = gain[i];
        }
        return max_altitude;
    }
}