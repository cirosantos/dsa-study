package strings.counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharFrequencyMap {
    public static Map<String, Integer> countCharacters(String s) {
        Map<String, Integer> dictionary = new HashMap<>();
        for (Character c : s.toCharArray()) {
            dictionary.put(String.valueOf(c), dictionary.getOrDefault(String.valueOf(c), 0)+1);
        }
        return dictionary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        Map<String, Integer> res = countCharacters(s);
        Map<String, Integer> resSorted = new TreeMap<>(res);
        for (String key : resSorted.keySet()) {
            System.out.println(key + " " + resSorted.get(key));
        }
    }


}
