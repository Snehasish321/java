// Write a Program to perform Binary Search for a given set of integer values recursively and nonrecursively.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 10, 18, 29, 33, 40, 55, 71};
        int target = 29;
        System.out.println("Recursive Search - Element " + target + " is at index: " + binarySearchRecursive(arr, target, 0, arr.length - 1));
        System.out.println("Non-Recursive Search - Element " + target + " is at index: " + binarySearchIterative(arr, target));
    }

    static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        return arr[mid] > target ? binarySearchRecursive(arr, target, left, mid - 1) : binarySearchRecursive(arr, target, mid + 1, right);
    }

    static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
// Space Complexity: O(1)
//time complexity: O(log n)
//output: Recursive Search - Element 29 is at index: 3
//        Non-Recursive Search - Element 29 is at index: 3