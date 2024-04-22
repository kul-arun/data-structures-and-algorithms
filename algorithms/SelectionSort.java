import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 48, 3, 67, 9, 21};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minValueIdx = i;
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[j] < arr[minValueIdx])
                    minValueIdx = j;
            }
            if (minValueIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minValueIdx];
                arr[minValueIdx] = temp;
            }
        }
    }
}