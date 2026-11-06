package assignment1;

public class StringHandler {

    // Replace "c" with and "s" inside a string

    public String stringManipulation(String str) {
        return str.replace("c", "s");
    }

    // Return the length of str. If the input str is null or "" you must return 0

    public int stringLength(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        return str.length();
    }

    // Return the cumulative length of all strings in arr

    public int stringArrayLength(String[] arr) {
        int total = 0;

        for (String word : arr)
        {
            total += word.length();
        }
        return total;
    }

    // Return reverse the characters in the String str, e.g. "Hello" -> "olleH"

    public String stringReverse(String str) {
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    // Return how many occurrences of the character c in the String str. The method should not be case-sensitive.

    public int charCount(String str, char c) {
        int count = 0;
        char searchChar = Character.toLowerCase(c);

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == searchChar) {
                count++;
            }
        }
        return count;
    }

    // Returns a string that contains exactly the amount of chars c, as stated by the given amount.

    public String stringOfChars(int amount, char c) {
        String chars = "";

        for (int i = 0; i < amount; i++) {
            chars += c;
        }
        return chars;
    }


}
