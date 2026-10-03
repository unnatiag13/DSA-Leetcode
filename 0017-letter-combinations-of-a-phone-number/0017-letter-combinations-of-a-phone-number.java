class Solution {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        LetterCombinations(digits,"",ll);
        return ll;
    }
    public static void LetterCombinations(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num =ch - '0';
        String press = map[num];
        for(int i=0;i<press.length();i++){
            LetterCombinations(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}