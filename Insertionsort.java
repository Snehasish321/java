//  Write a program to perform Insertion sort for any given list of numbers.
public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int num : arr) System.out.print(num + " ");
    }
}
// Time Complexity: O(n) in the best case, O(n^2) in the average and worst cases.
// Space Complexity: O(1)
//output: 10 13 14 29 37