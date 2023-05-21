import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 21/05/2023
 */
public class TwoSum {
    public static void main(String[] args) {
        /*System.out.println(Arrays.toString(
                findTwoSumElements(new int[]{3, 2, 4}, 6))
        );*/
        System.out.println(Arrays.toString(
                findTwoSumIndex(new int[]{2, 7, 15, 11}, 9))
        );
        System.out.println(Arrays.toString(
                findTwoSumElements(new int[]{2, 7, 15, 11}, 9))
        );
        System.out.println(findAllPossibleAnswers(new int[]{3, 2, 4, 5, 6, 7, 3, 3}, 6));
    }

    static int[] findTwoSumElements(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            }
        }
        return null;
    }

    static int[] findTwoSumIndex(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    static List<List<Integer>> findAllPossibleAnswers(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                list.add(Arrays.asList(map.get(diff), i));
            }
            map.put(nums[i], i);
        }
        return list;
    }
}
