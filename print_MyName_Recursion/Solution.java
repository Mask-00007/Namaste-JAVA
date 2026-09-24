package print_MyName_Recursion;

public class Solution {
    public static void printMyName(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Raj");

        printMyName(n - 1);
    }

    public static void main(String[] args) {
        printMyName(4);
    }
}
