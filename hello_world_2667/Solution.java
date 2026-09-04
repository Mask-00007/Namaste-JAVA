package hello_world_2667;

import java.util.function.Supplier;

class Solution {
    public static Supplier<String> createHelloWorld() {
        return () -> "Hello World";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Supplier<String> f = sol.createHelloWorld();
        System.out.println(f.get());
    }
}
