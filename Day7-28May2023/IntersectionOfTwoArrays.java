import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 28/05/2023
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                findIntersection(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2}))
        );
        System.out.println(Arrays.toString(
                findIntersection(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4}))
        );
    }

    static int[] findIntersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[20];
        for (int i : nums1) {
            count[i]++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] != 0) {
                list.add(nums2[i]);
                count[nums2[i]] = 0;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
