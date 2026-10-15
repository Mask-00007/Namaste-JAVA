package sentence_IsAnagram;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // true
        System.out.println(sol.checkIfPangram("leetcode")); // false
    }
}
