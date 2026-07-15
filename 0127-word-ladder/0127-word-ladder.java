class Pair{
    String word;
    int level;

    Pair(String _word, int _level){
        this.word = _word;
        this.level = _level;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>();
        for(String word:wordList){
            set.add(word);
        }
        int len = wordList.get(0).length();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.peek().word;
            int level = q.peek().level;
            q.poll();

            if(word.equals(endWord)) return level;

            for(int i=0;i<len;i++){
                for(char ch='a';ch<='z';ch++){
                    char[] arr = word.toCharArray();
                    arr[i] = ch;
                    String newWord = new String(arr);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        q.offer(new Pair(newWord,1+level));
                    }
                }
            }
        }

        return 0;
    }
}