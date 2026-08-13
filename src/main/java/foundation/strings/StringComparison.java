package foundation.strings;

/**
 * Implement a function that compares two strings lexicographically.
 * Return -1 if the first string comes before the second, 0 if they are equal,
 *  and 1 if the first string comes after the second.
 */
public class StringComparison {
    public static int compareStrings(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();
        int res = compareStrings(s1, s2);
        System.out.println(res);
    }
}
