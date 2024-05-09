import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 48, 3, 67, 9, 21};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i-1; j >= 0 && arr[j+1] < arr[j]; --j) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}