import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 24/06/2023
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {8, 9, 6, 14, -2, 5, 0, 7};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                min_index = (arr[j] < arr[min_index]) ? j : min_index;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
