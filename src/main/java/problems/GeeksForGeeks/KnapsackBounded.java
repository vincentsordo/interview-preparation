package problems.GeeksForGeeks;

/**
 *
 * Given weights and values of n items, put these items in a knapsack
 * of capacity W to get the maximum total value in the knapsack. In
 * other words, given two integer arrays val[0..n-1] and wt[0..n-1]
 * which represent values and weights associated with n items
 * respectively. Also given an integer W which represents knapsack
 * capacity, find out the maximum value subset of val[] such that sum
 * of the weights of this subset is smaller than or equal to W. You
 * cannot break an item, either pick the complete item, or don’t pick
 * it (0-1 property).
 *
 * Example:
 * int [] values = new int {60, 100, 120}
 * int [] weights = new int {10, 20, 30}
 * W = 50
 *
 * Solution: 220
 *
 * Bounded = only one item allowed
 */
public class KnapsackBounded {
    /**
     * The issue that this solution creates is overlapping sub problems,
     * so we can improve it by using memoization
     * @param maxWeight
     * @param weights
     * @param values
     * @param n
     * @return
     */
    public int getMaxValue(int maxWeight, int weights[], int values[], int n) {
        if (n == 0 || maxWeight == 0) {
            return 0;
        }

        // if we cannot fit this item then skip over it
        if (weights[n - 1] > maxWeight) {
            return getMaxValue(maxWeight, weights, values, n - 1);
        } else {
            // otherwise return the max of including the item versus not including the item
            return Math.max(
                values[n - 1] + getMaxValue(maxWeight - weights[n - 1], weights, values, n -1 ),
                getMaxValue(maxWeight, weights, values, n - 1)
            );
        }
    }

    /**
     * Get max value using dynamic programming
     * Bottom-up approach
     *
     * @param maxWeight
     * @param weights
     * @param values
     * @param n
     * @return
     */
    public int getMaxValueDP(int maxWeight, int weights[], int values[], int n) {
        int map[][] = new int[n+1][maxWeight+1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0) {
                    map[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    map[i][w] = Math.max(
                            values[i-1] + map[i-1][w - weights[i - 1]],
                            map[i-1][w]
                    );
                } else {
                    map[i][w] = map[i-1][w];
                }
            }
        }

        return map[n][maxWeight];
    }
}
