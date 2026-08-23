package element_transformation_2635;

import java.util.*;
import java.util.function.Function;

public class TransformArray {
    public static <T, R> List<R> map(List<T> arr, Function<T, R> fn) {
        List<R> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            result.add(fn.apply(arr.get(i))); // apply function to each element
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3);

        List<Integer> plusOne = map(arr, n -> n + 1);
        System.out.println(plusOne);
    }

}
