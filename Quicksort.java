// Write a program to perform Quick Sort for the given list of integer values.
public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {33, 10, 55, 71, 29, 3, 18};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) System.out.print(num + " ");
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot) swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
}
// Time Complexity: O(n log n) in the average and best cases, O(n^2) in the worst case.
// Space Complexity: O(log n) in the average and best cases, O(n) in the worst case.
//output: 3 10 18 29 33 55 71