package foundation.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that finds the maximum element in an array of integers.
 *
 * For example:
 *
 * [3, 1, 4, 1, 5] → 5
 * [-10, -3, -7, -1] → -1
 * [42] → 42
 * Parameters:
 *
 * nums: an array of integers (at least 1 element)
 * Return:
 *
 * The maximum value in the array
 */
public class FindMaximum {
    public static int findMaximum(List<Integer> nums) {
        int max = Integer.MIN_VALUE;
        for (Integer in : nums) {
            if (in > max) {
                max = in;
            }
        }
        return max;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = findMaximum(nums);
        System.out.println(res);
    }
}
