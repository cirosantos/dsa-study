package foundation.strings.counting;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    private static void findFrequencyAscii(String text, char target) {
        // For ASCII only, use array (faster)
        int[] asciiFreq = new int[128];
        for (char c : text.toCharArray()) {
            asciiFreq[c]++;
        }
        System.out.println(asciiFreq[target]);  // 2
    }

    private static void findMostFrequentChar(Map<Character, Integer> freq) {
        // Find most frequent character
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar);  // 'l'
    }

    private static Map<Character, Integer> getCharFrequencyMap(String text) {
        // Using HashMap for character counts (general case)
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);  // {h=1, e=1, l=2, o=1}
        System.out.println(freq.get('l'));  // 2
        return freq;
    }

    // Find the first non-repeating character
    public static char firstUnique(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }

        return '\0';  // No unique character
    }

    // Validate password has required character types
    public static boolean validPassword(String password) {
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
        }

        return hasDigit && hasUpper && hasLower;
    }

    public static void main(String[] args) {
        String text = "hello";
        // HashMap for general case, array for ASCII-only optimization.
        findMostFrequentChar(getCharFrequencyMap(text));
        findFrequencyAscii(text, 'l');

        firstUnique(text);
        System.out.println(firstUnique("swiss"));  // 'w'
        System.out.println("password valid: " + validPassword(text));
        System.out.println("password valid: " + validPassword("e(3rT"));
    }

}
