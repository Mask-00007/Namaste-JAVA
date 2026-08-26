package isObject_empty_2727;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean isEmpty(Object obj) {
        if (obj instanceof java.util.List) {

            return ((java.util.List<?>) obj).isEmpty();
        } else if (obj instanceof java.util.Map) {

            return ((java.util.Map<?, ?>) obj).isEmpty();
        }

        return false;
    }

    public static void main(String[] args) {

        Map<String, Integer> obj1 = new HashMap<>();
        obj1.put("x", 5);
        obj1.put("y", 42);
        System.out.println(isEmpty(obj1));

    }
}
