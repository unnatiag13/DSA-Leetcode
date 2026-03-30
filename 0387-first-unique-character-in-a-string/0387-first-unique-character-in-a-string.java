class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            q.offer(c);
        }
        while(!q.isEmpty()){
            if(freq[q.peek()-'a']>1) q.poll();
            else break;
        }
        if(q.isEmpty()) return -1;
        else{
            char unique = q.poll();
            for(int i=0;i<s.length();i++){

                if(s.charAt(i)==unique) return i; 
            }
        } 
        return -1;
    }
}