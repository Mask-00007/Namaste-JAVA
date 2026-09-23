package reverse_Stringg;

public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "hello";
        System.out.println("Reversed string: " + sol.reverseString(s));
    }
}
