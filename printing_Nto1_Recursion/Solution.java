package printing_Nto1_Recursion;

public class Solution {
    static void printNTo1(int n, int count) {
        if (count > n) {
            return;
        }

        printNTo1(n, count + 1);
        System.out.println(count);
    }

    public static void main(String[] args) {
        printNTo1(10, 01);
    }

}
