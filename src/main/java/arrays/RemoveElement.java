package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that removes all instances of a target value from an array, returning a new array without those elements.
 *
 * For example:
 *
 * [1, 2, 3, 2, 4, 2], target 2 → [1, 3, 4]
 * [5, 5, 5], target 5 → [] (empty array)
 * [1, 2, 3], target 7 → [1, 2, 3] (nothing removed)
 * Parameters:
 *
 * nums: an array of integers
 * target: the value to remove
 * Return:
 *
 * A new array with all instances of target removed
 */
public class RemoveElement {
    public static List<Integer> removeElement(List<Integer> nums, int target) {
        int idx = 0;
        List<Integer> unique = new ArrayList();
        for (Integer i : nums) {
            if (i != target) {
                unique.add(i);
            }
        }
        return unique;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        List<Integer> res = removeElement(nums, target);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
