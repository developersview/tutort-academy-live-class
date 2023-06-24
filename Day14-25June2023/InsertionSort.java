import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 24/06/2023
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {6, 3, 0, 5, 1};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
