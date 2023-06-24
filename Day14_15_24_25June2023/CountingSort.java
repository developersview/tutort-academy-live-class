import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 24/06/2023
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr1 = {6, 3, 0, 5, 1};
        System.out.println(Arrays.toString(countingSort(arr1)));
    }

    static int[] countingSort(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        //find the largest element of the array
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        //initialize count array with all zero
        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        //Store the count of each element
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = 0; i < n; i++) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        return output;
    }
}
