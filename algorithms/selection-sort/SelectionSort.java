import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {11, 35, 46, 27, 8, 73, 2};
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; ++i) {
            // Assume the index of the smallest item to be i.
            int minElementIdx = i;
            for (int j = i+1; j < n; ++j) {
                if (array[j] < array[minElementIdx]) {
                    minElementIdx = j;
                }
            }
            // swap elements if smallest item is not at index i.
            if (minElementIdx != i) {
                int temp = array[i];
                array[i] = array[minElementIdx];
                array[minElementIdx] = temp;
            }
        }
    }

}