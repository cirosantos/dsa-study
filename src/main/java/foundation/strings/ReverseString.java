package foundation.strings;

/**
 * Write a function that reverses a string. The function should take a string as input and return a new string with characters in reverse order.
 *
 * For example:
 *
 * "hello" → "olleh"
 * "AlgoMonster" → "retsnoMoglA"
 * "a" → "a"
 * Parameters:
 *
 * s: a string to reverse
 * Return:
 *
 * The reversed string
 */
public class ReverseString {
    public static String reverseString(String s) {
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            char cTemp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = cTemp;
            left++;
            right--;
        }
        return new String(sArray);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = reverseString(s);
        System.out.println(res);
    }
}
