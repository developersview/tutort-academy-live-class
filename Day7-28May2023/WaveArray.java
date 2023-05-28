import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 28/05/2023
 */
public class WaveArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(waveFormOfArray(new int[]{7, 8, 9, 3, 4})));
        System.out.println(Arrays.toString(waveFormOfArrayMethod2(new int[]{7, 8, 9, 3, 4})));
    }

    //TC-> O(nlogn), SC->O(1)
    static int[] waveFormOfArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    //TC -> O(n)
    static int[] waveFormOfArrayMethod2(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            } else if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
