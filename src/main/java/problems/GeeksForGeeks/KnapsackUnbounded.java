package problems.GeeksForGeeks;

/**
 * Given a knapsack weight W and a set of n items with
 * certain value and weight, we need to calculate minimum
 * amount that could make up this quantity exactly. This
 * is different from classical Knapsack problem, here we
 * are allowed to use unlimited number of instances of an
 * item.
 *
 * Unbounded = unlimited items
 */
public class KnapsackUnbounded {
    public int getMaxValue(int weight, int [] weights, int [] values, int n) {
        int [] dp = new int [weight + 1];

        for (int i = 0; i <= weight; i++) {
            for (int j = 0; j < n; j++) {
                if (weights[j] <= i) {
                    dp[i] = Math.max(
                            dp[i - weights[j]] + values[j],
                            dp[i]
                    );
                }
            }
        }

        return dp[weight];
    }
}
