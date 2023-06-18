/**
 * @author pranoy.chakraborty
 * @Date 18/06/2023
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0,3,4,9,10,12,15},9));
        System.out.println(binarySearch(new int[]{0,3,4,9,10,12,15},11));
    }

    static int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
