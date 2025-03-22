// Write a program to find Maximum and Minimum of the given set of integer values.
import java.util.Arrays;

public class integer {
    public static void main(String[] args) {
        int[] arr = {33, 10, 55, 71, 29, 3, 18};  

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
// Time Complexity: O(n log n)
// Space Complexity: O(1)
//output: 3, 10, 18, 29, 33, 55, 71