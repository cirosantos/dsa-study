package foundation.strings;

/**
 * Write a function that compresses a string by replacing consecutive identical characters with the character followed by the count of repetitions.
 *
 * For example:
 *
 * "aaabbc" becomes "a3b2c1"
 * "aabbccdd" becomes "a2b2c2d2"
 * "abc" becomes "a1b1c1"
 * Parameters:
 *
 * s: a string to compress
 * Return:
 *
 * A compressed string where each character is followed by its count
 */
public class StringCompression {
    public static String compressString(String s) {
        StringBuffer result = new StringBuffer();
        Character lastChar = s.charAt(0);
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c.compareTo(lastChar) == 0) {
                count++;
            } else {
                result.append(lastChar);
                result.append(count);
                count = 1;
            }
            lastChar = c;
        }
        // includes last char
        result.append(lastChar);
        result.append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = compressString(s);
        System.out.println(res);
    }
}
