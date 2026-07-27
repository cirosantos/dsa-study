package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that rotates an array k positions to the right.
 *
 * For example:
 *
 * [1, 2, 3, 4, 5], k = 2 → [4, 5, 1, 2, 3]
 * [1, 2, 3], k = 4 → [3, 1, 2] (k > array length wraps around)
 * [1, 2, 3, 4], k = 0 → [1, 2, 3, 4] (no rotation)
 * Parameters:
 *
 * nums: an array of integers
 * k: number of positions to rotate right
 * Return:
 *
 * A new array with elements rotated k positions to the right
 */
public class RotateArray {
    public static List<Integer> rotateArray(List<Integer> nums, int k) {
        while (k > 0) {
            for (int i = 0; i < nums.size(); i++) {
                if (i == nums.size() - 1) {
                    nums.set(0, nums.get(nums.size() -1));
                } else {
                    nums.set(i+1, nums.get(i));
                }
            }
            k--;
        }
        return nums;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> nums = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int k = Integer.parseInt(scanner.nextLine());
        scanner.close();
        List<Integer> res = rotateArray(nums, k);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
