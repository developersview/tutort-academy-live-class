import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 13/05/2023
 */
public class Arrays1 {

    public static void main(String[] args) {
        // findGreatestThreeValues(new int[]{2, 2, 2, 2, 2, 2});
       // mergeTwoSortedArray(new int[]{-1, 4, 6, 8}, new int[]{2, 5, 10, 11});
        fizzBuzz(15);
    }

    public static void findGreatestThreeValues(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max1 <= arr[i]) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (max2 <= arr[i]) {
                max3 = max2;
                max2 = arr[i];
            } else if (max3 <= arr[i]) {
                max3 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }

    public static void mergeTwoSortedArray(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;
        int i = 0, j = 0, k = 0;
        int[] result = new int[len1 + len2];
        while (i < len1 && j < len2) {
            if (A[i] < B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }
        while (i < len1) {
            result[k++] = A[i++];
        }
        while (j < len2) {
            result[k++] = B[j++];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void fizzBuzz(int n) {
        String[] ans =new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i-1] = "fizzbuzz";
            } else if (i % 3 == 0) {
                ans[i-1] = "fizz";
            } else if (i % 5 == 0) {
                ans[i-1] = "buzz";
            } else {
                ans[i-1]=String.valueOf(i);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}