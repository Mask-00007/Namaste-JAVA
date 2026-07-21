import java.util.HashSet;

public class findDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; // found duplicate
            }
            seen.add(num);
        }
        return -1; // no duplicate found
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 3 };
        System.out.println("Dupicate Number is: " + findDuplicate(nums));
    }
}
