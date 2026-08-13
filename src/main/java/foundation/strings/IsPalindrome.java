package foundation.strings;

/**
 * Write a function that checks if a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward.
 *
 * For example:
 *
 * "racecar" is a palindrome
 * "hello" is not a palindrome
 * "a" is a palindrome (single character)
 * Parameters:
 *
 * s: a string to check
 * Return:
 *
 * true if the string is a palindrome, false otherwise
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
