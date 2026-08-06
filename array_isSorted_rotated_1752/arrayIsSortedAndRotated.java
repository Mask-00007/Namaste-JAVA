package array_isSorted_rotated_1752;

public class arrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int drops = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                drops++;
                if (drops > 1)
                    return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        arrayIsSortedAndRotated obj = new arrayIsSortedAndRotated();
        int[] nums1 = { 3, 4, 5, 1, 2 };
        System.out.println(obj.check(nums1));
    }

}