package problems.GeeksForGeeks;

/**
 * Ways to write n as sum of two or more positive integers
 * For a given number n > 0, find the number of different
 * ways in which n can be written as a sum of at two or
 * more positive integers.
 *
 * Input : n = 5
 * Output : 6
 * Explanation : All possible six ways are :
 * 4 + 1
 * 3 + 2
 * 3 + 1 + 1
 * 2 + 2 + 1
 * 2 + 1 + 1 + 1
 * 1 + 1 + 1 + 1 + 1
 */
public class NumberOfWays {
    /**
     * This problem can be solved in the similar fashion as coin
     * change problem, the difference is only that in this case
     * we should iterate for 1 to n-1 instead of particular values
     * of coin as in coin-change problem.
     *
     * @param n
     * @return
     */
    public int getNumberOfWays(int n) {
        int table[] = new int [n + 1];

        table[0] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                table[j] += table[j - i];
            }
        }

        return table[n];
    }
}
