package highest_altitude;

public class Solution {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(sol.largestAltitude(gain)); // Output: 1
    }
}