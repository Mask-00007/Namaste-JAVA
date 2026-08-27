package sort_By_2724;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortBy {
    public static <T, R extends Comparable<R>> List<T> sortBy(List<T> arr, java.util.function.Function<T, R> fn) {

        List<T> sortedArr = new ArrayList<>(arr);

        sortedArr.sort(Comparator.comparing(fn));

        return sortedArr;
    }

    public static void main(String[] args) {
        sortBy sorter = new sortBy();

        List<String> words = Arrays.asList("apple", "kiwi", "banana");
        List<String> result2 = sorter.sortBy(words, s -> s.length());
        System.out.println(result2);
    }
}
