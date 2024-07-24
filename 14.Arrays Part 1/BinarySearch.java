public class BinarySearch {
    public static int bslogic(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparisons
            if (numbers[mid] == key) { // Mid
                return mid;
            }
            if (numbers[mid] < key) { // Right
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean contains(int numbers[], int key) {
        for (int number : numbers) {
            if (number == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;
        int b = bslogic(numbers, key);
        if (b == -1 || !contains(numbers, key)) {
            System.out.println("Invalid Key, doesn't exist in array");
        } else {
            System.out.println("Index for key is: " + b);
        }
    }
}
