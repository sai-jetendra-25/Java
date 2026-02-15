import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {25,3,35,72,12};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int first = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[first]) {
                    first = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[first];
            arr[first] = arr[i];
            arr[i] = temp;
        }
    }
}
    

