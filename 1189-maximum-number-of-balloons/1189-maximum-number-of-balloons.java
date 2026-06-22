class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:text.toCharArray()){
            if(ch=='b' || ch =='a'|| ch=='l'||ch=='o'||ch=='n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        if(!map.containsKey('b') || !map.containsKey('a') || 
            !map.containsKey('l') || !map.containsKey('o') || 
            !map.containsKey('n')) return 0;

        int[] balloonfreq = {map.get('b'),map.get('a'),map.get('l')/2,map.get('o')/2,map.get('n')};

        int ans=balloonfreq[0];
        
        for(int i:balloonfreq){
            if(i<ans) ans =i;
        } 
        return ans;
    }
}