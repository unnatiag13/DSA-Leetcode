class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ansll = new ArrayList<>();
        Partition(s,ll,ansll);
        return ansll;
    }
    public static void Partition(String ques,List<String> ll,List<List<String>> ansll){
        if(ques.length()==0){
            ansll.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s = ques.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                Partition(ques.substring(i),ll,ansll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}