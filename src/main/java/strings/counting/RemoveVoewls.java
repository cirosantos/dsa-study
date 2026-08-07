package strings.counting;

/**
 * Write a function that removes all vowels from a given string. Vowels include both lowercase (a, e, i, o, u) and uppercase (A, E, I, O, U) letters.
 *
 * For example:
 *
 * "hello world" becomes "hll wrld"
 * "AlgoMonster" becomes "lgMnstr"
 * "aeiou" becomes "" (empty string)
 * Parameters:
 *
 * s: a string to process
 * Return:
 *
 * A new string with all vowels removed
 */
public class RemoveVoewls {
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuffer sb = new StringBuffer();
        for (Character c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = removeVowels(s);
        System.out.println(res);
    }
}
