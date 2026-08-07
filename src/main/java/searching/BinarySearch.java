package searching;

/**
 * Example: Binary Search in Sorted Array
 *
 * What if the names are sorted alphabetically? Now you can do better.
 * Check the middle name. If your target comes alphabetically before it, you know the target can only be in the first half.
 * If it comes after, only in the second half. You just eliminated half the names with one comparison.
 * Repeat this process: check the middle of the remaining half, eliminate another half.
 * Each comparison cuts the search space in half.
 *
 * With 1000 sorted names, you check the middle (comparison 1), then the middle of the remaining 500 (comparison 2),
 * then the middle of 250 (comparison 3), then 125, 64, 32, 16, 8, 4, 2, 1.
 * That's about 10 comparisons total, worst case. Not 500 on average, just 10.
 * For a million names? About 20 comparisons. The difference is dramatic.
 */
public class BinarySearch {
    public static void main(String[] args) {
        binarySearch(new String[]{"Alice", "Bob", "Charlie", "Ciro", "Emma", "Gabe", "Robin", "Taylor", "Zoe"}, "Ciro");
    }

    private static boolean binarySearch(String[] names, String target) {
        int left = 0;
        int right = names.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println(mid);
            int comparison = names[mid].compareTo(target);
            if (comparison == 0) {
                System.out.println("Found " + target + " at index " + mid);
                return true;
            } else if (comparison < 0) {
                left = mid + 1;
                System.out.println("left: " + names[mid]);
            } else {
                right = mid - 1;
                System.out.println("right: "  + names[mid]);
            }
        }

        System.out.println(target + " not found in the array.");
        return false;
    }
}
