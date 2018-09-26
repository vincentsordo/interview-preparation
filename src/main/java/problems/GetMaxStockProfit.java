package problems;

/**
 * Max Profit of Stock Price
 *
 * <p>
 * First, I wanna know how much money I could have made yesterday
 * if I'd been trading Apple stocks all day.
 * <p>
 * So I grabbed Apple's stock prices from yesterday and put them
 * in an array called stockPrices, where:
 * <p>
 * The indices are the time (in minutes) past trade opening time,
 * which was 9:30am local time. The values are the price (in US dollars)
 * of one share of Apple stock at that time. So if the stock cost $500 at
 * 10:30am, that means stockPrices[60] = 500.
 * <p>
 * Write an efficient method that takes stockPrices and returns the best
 * profit I could have made from one purchase and one sale of one share
 * of Apple stock yesterday.
 * <p>
 * Example:
 * int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
 * <p>
 * getMaxProfit(stockPrices);
 * // returns 6 (buying for $5 and selling for $11)
 */
public class GetMaxStockProfit {
    /**
     * Time Complexity: 0(n) - we need to iterate over the whole list
     * Space Complexity: 0(1) - because we are not using any extra storage besides
     * temp variables.
     * <p>
     * If all the values are going down then I would suggest that you don't buy or sell
     * any stock.
     * <p>
     * This one's a good example of the greedy ↴ approach in action. Greedy approaches
     * are great because they're fast (usually just one pass through the input). But
     * they don't work for every problem.
     *
     * @param stockPrices
     * @return
     */
    public int getMaxProfit(int[] stockPrices) {
        if (stockPrices == null || stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int currentStockPrice : stockPrices) {
            if (currentStockPrice <= 0) {
                throw new IllegalArgumentException("Stock price cannot be negative");
            }
            if (currentStockPrice < min) {
                min = currentStockPrice;
            } else {
                maxProfit = Math.max(maxProfit, currentStockPrice - min);
            }
        }

        return maxProfit;
    }
}
