package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that counts how many times a target value appears in an array of integers.
 *
 * For example:
 *
 * [1, 2, 3, 2, 4, 2], target 2 → 3
 * [5, 5, 5, 5], target 5 → 4
 * [1, 2, 3], target 7 → 0 (not found)
 * Parameters:
 *
 * nums: an array of integers
 * target: the value to count
 * Return:
 *
 * The number of times target appears in the array
 */
public class CountOccurrences {
    public static int countOccurrences(List<Integer> nums, int target) {
        int appearances = 0;
        for (Integer i : nums) {
            if (i == target) {
                appearances++;
            }
        }
        return appearances;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = countOccurrences(nums, target);
        System.out.println(res);
    }
}
