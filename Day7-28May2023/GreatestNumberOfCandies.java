import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 28/05/2023
 */
public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
