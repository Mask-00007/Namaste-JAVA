package next_Greatest_Letter_744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid; // potential answer, move left
            } else {
                left = mid + 1; // need something greater
            }
        }

        return letters[left % letters.length];
    }
}
