package foundation.strings;

/**
 * Practice working with immutable strings by implementing a safe character replacement function.
 */
public class CharReplacement {
    public static String safeModifyString(String s, int index, String newChar) {
        if (index < 0 || index >= s.length())
            return s;
        StringBuffer sb = new StringBuffer();
        sb.append(s.substring(0, index));
        sb.append(newChar);
        sb.append(s.substring(index + 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        String newChar = scanner.nextLine();
        scanner.close();
        String res = safeModifyString(s, index, newChar);
        System.out.println(res);
    }
}
