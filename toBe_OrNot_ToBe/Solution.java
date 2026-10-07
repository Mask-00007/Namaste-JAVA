package toBe_OrNot_ToBe;

public class Solution {

    private final Object value;

    public Solution(Object value) {
        this.value = value;
    }

    public boolean toBe(Object other) {
        if (value == null && other == null)
            return true;
        if (value != null && value.equals(other))
            return true;
        throw new RuntimeException("Not Equal");
    }

    public boolean notToBe(Object other) {
        if (value == null && other != null)
            return true;
        if (value != null && !value.equals(other))
            return true;
        throw new RuntimeException("Equal");
    }

    // Quick demo
    public static void main(String[] args) {
        System.out.println(new Solution(5).toBe(5)); // true
        System.out.println(new Solution(5).notToBe(null)); // true

    }
}
