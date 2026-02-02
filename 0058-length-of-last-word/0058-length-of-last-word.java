class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr = s.split(" ");
        // String word = arr[arr.length - 1];
        // word=word.trim();
        // return word.length();

        int len = 0;
        int i= s.length()-1;

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            len++;
        }
        return len;
    }
}