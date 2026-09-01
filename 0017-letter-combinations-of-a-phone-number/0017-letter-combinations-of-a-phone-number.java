class Solution {
    static String[] map = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        dfs(digits, 0, new StringBuilder(), ans);
        return ans;
    }
    private void dfs(String digits, int idx, StringBuilder path, List<String> ans) {
        if (idx == digits.length()) {
            ans.add(path.toString());
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            path.append(c);
            dfs(digits, idx + 1, path, ans);
            path.deleteCharAt(path.length() - 1);
        }
    }
}