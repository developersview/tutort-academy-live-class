import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 24/06/2023
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {8, 9, 6, 14, -2, 5, 0, 7, 1, 15, 31, 19};
        int[] arr2 = {6, 3, 0, 5};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
