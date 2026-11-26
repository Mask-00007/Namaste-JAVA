package Unique_Length_3_Palindromic_Subsequences;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);

            if (first != -1 && last - first >= 2) {
                Set<Character> middleChars = new HashSet<>();

                for (int i = first + 1; i < last; i++) {
                    middleChars.add(s.charAt(i));
                }

                result += middleChars.size();
            }
        }

        return result;
    }
}