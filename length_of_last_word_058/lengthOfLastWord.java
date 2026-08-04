package length_of_last_word_058;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');

        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));

    }

}