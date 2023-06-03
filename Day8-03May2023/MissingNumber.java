/**
 * @author pranoy.chakraborty
 * @Date 03/06/2023
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{4, 0, 1, 2}, 4));
        System.out.println(findMissingNumberMethod2(new int[]{4, 0, 1, 2}, 4));
    }

    static int findMissingNumber(int[] nums, int n) {
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    static int findMissingNumberMethod2(int[] nums, int n) {
        int nXorSum = 0, inputXor = 0;
        for (int i = 0; i <= n; i++) {
            nXorSum ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            inputXor ^= nums[i];
        }
        return inputXor ^ nXorSum;
    }
}
