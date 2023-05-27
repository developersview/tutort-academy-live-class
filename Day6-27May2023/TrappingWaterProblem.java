/**
 * @author pranoy.chakraborty
 * @Date 27/05/2023
 */
public class TrappingWaterProblem {
    public static void main(String[] args) {
        System.out.println(findTrappedWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(findTrappedWaterMethod2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    static int findTrappedWater(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for (int i = 1; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }
        return water;
    }

    static int findTrappedWaterMethod2(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        while (left <= right) {
            if (left_max <= right_max) {
                water += Math.max(0, left_max - height[left]);
                left_max = Math.max(left_max, height[left]);
                left++;
            } else {
                water += Math.max(0, right_max - height[right]);
                right_max = Math.max(right_max, height[right]);
                right--;
            }
        }
        return water;
    }
}
