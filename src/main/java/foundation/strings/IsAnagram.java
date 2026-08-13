package foundation.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function that determines if two strings are anagrams of each other. Two strings are anagrams if they contain the same characters with the same frequencies, just rearranged.
 *
 * For example:
 *
 * "listen" and "silent" are anagrams
 * "hello" and "world" are not anagrams
 * "rat" and "car" are not anagrams
 * Parameters:
 *
 * s: the first string
 * t: the second string
 * Return:
 *
 * true if the strings are anagrams, false otherwise
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCount = new HashMap<>();

        for (Character c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        for (Character c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) -1);
            if (charCount.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        scanner.close();
        boolean res = isAnagram(s, t);
        System.out.println(res);
    }
}
