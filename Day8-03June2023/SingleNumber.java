/**
 * @author pranoy.chakraborty
 * @Date 03/06/2023
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(findSingleNumber(new int[]{4, 1, 2, 1, 2, 4, 5}));
    }

    static int findSingleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
