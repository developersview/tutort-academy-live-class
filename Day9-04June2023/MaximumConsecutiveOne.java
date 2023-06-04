/**
 * @author pranoy.chakraborty
 * @Date 04/06/2023
 */
public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        System.out.println(maximumConsecutiveOne(new int[]{1, 1, 0, 1, 1, 1, 1, 0, 1}));
        System.out.println(maximumConsecutiveOneFlipped(new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1}));
    }

    static int maximumConsecutiveOne(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    static int maximumConsecutiveOneFlipped(int[] nums) {
        int countOfZero = 0, n = nums.length, i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (nums[j] == 0) {
                countOfZero++;
            }
            while (countOfZero > 1) {
                if (nums[i] == 0) countOfZero--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;

        }
        return ans;
    }
}
