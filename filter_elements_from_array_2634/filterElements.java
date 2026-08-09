package filter_elements_from_array_2634;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterElements {
    public static <T> List<T> filter(List<T> arr, Predicate<T> fn) {
        return arr.stream()
                .filter(fn)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 10, 20, 30);
        Predicate<Integer> greaterThan10 = n -> n > 10;

        List<Integer> result = filter(arr, greaterThan10);
        System.out.println(result); // Output: [20, 30]
    }
}
