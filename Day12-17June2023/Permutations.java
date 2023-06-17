import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 17/06/2023
 */
public class Permutations {
    public static void main(String[] args) {
        System.out.println(findPermutations(new int[]{1, 2, 3}));
    }

    static List<List<Integer>> findPermutations(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length - 1;
        permutations(res, nums, 0, n);
        return res;
    }

    private static void permutations(List<List<Integer>> res, int[] nums, int low, int high) {
        if (low == high) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                row.add(nums[i]);
            }
            res.add(row);
        }
        for (int i = low; i <= high; i++) {
            swap(nums, low, i);
            permutations(res, nums, low + 1, high);
            swap(nums, low, i);
        }
    }

    static void swap(int[] nums, int low, int i) {
        int temp = nums[low];
        nums[low] = nums[i];
        nums[i] = temp;
    }
}
