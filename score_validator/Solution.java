package score_validator;

public class Solution {

    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for (String event : events) {
            if (event.equals("W")) {
                counter++;

                if (counter == 10) {
                    break;
                }
            } else if (event.equals("WD") || event.equals("NB")) {
                score++;
            } else {
                score += Integer.parseInt(event);
            }
        }

        return new int[] { score, counter };
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] events = { "1", "4", "W", "6", "WD" };

        int[] result = sol.scoreValidator(events);

        System.out.println("Score: " + result[0]);
        System.out.println("Counter: " + result[1]);
    }
}