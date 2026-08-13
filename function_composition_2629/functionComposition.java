package function_composition_2629;

import java.util.List;
import java.util.function.Function;

public class functionComposition {
    public static Function<Integer, Integer> compose(List<Function<Integer, Integer>> functions) {
        return x -> {
            int result = x;
            // Apply functions from right to left
            for (int i = functions.size() - 1; i >= 0; i--) {
                result = functions.get(i).apply(result);
            }
            return result;
        };
    }

    public static void main(String[] args) {

        List<Function<Integer, Integer>> functions1 = List.of(
                x -> x + 1,
                x -> x * x,
                x -> 2 * x);
        Function<Integer, Integer> fn1 = compose(functions1);
        System.out.println(fn1.apply(4));

    }
}
