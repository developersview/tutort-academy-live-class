/**
 * @author pranoy.chakraborty
 * @Date 28/05/2023
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(findMaxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(findMaxProfit(new int[]{7, 6, 4, 3, 1}));

    }

    static int findMaxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
           // min = Math.min(prices[i], min);
            if (prices[i] - prices[i-1] > 0) {
                profit += prices[i] - prices[i-1];
                //min = prices[i];
            }
        }
        return profit;
    }
}
