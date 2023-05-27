/**
 * @author pranoy.chakraborty
 * @Date 27/05/2023
 */
public class MajorityElement {
    public static void main(String[] args) {
       // System.out.println(findMajorityElement(new int[]{1, 2, 3, 2, 4, 2, 2}));
       // System.out.println(findMajorityElement(new int[]{4, 4, 2, 4, 3, 4, 4, 3, 2, 4}));
        System.out.println(findMajorityElement(new int[]{1,3,3,3,4,4}));
    }

    //TC -> O(n) and SC -> O(1)
    static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count++;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
