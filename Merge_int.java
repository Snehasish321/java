// Write a Program to perform Merge Sort on the given two lists of integer values.
import java.util.Arrays;

public class Merge_int {
    public static void main(String[] args) {
        int[] arr1 = {33, 10, 55, 71, 29};
        int[] arr2 = {3, 18, 25, 40, 12};

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        for (int num : arr1) merged[i++] = num;
        for (int num : arr2) merged[i++] = num;

        mergeSort(merged, 0, merged.length - 1);

        System.out.println(Arrays.toString(merged));
    }

    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(a, l, m + 1);
        int[] right = Arrays.copyOfRange(a, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            a[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }
}
// Time Complexity: O(n log n) in all cases.
// Space Complexity: O(n)
//output: 3, 10, 12, 18, 25, 29, 33, 40, 55, 71