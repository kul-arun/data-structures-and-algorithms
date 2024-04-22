import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 48, 3, 67, 9, 21};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; ++j) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
