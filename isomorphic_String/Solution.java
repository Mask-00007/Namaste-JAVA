package isomorphic_String;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        // Arrays for ASCII mapping
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If already mapped, check consistency
            if (mapS[c1] != mapT[c2])
                return false;

            // Mark mapping (use i+1 to avoid default 0 conflict)
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isIsomorphic("egg", "add")); // true
        System.out.println(sol.isIsomorphic("foo", "bar")); // false
        System.out.println(sol.isIsomorphic("paper", "title"));// true
    }
}
