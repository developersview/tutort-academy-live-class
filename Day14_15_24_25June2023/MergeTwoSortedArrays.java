/**
 * @author pranoy.chakraborty
 * @Date 25/06/2023
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {

    }

    static int[] merge(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int k = i + j - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }
}
