//Write a program to perform Bubble sort for any given list of numbers.
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 10, 18, 29, 33, 40, 55, 71};
        bubbleSort(arr);
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
// Time Complexity: O(n^2)
// spece Complexcity: 0(1)
// output: 3 10 18 29 33 40 55 71