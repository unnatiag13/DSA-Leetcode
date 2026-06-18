class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        for(int i=0;i<s.length()-1;i++){
            int no1 = (int) s.charAt(i);
            int no2 = (int) s.charAt(i+1);
            sum += Math.abs(no1-no2);
        }
        return sum;
    }
}