package searching;

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
