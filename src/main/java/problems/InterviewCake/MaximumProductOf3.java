package problems.InterviewCake;
/**
     Given a list of integers, find the maximum product
     you can get from three of the integers.

     Assumption: The input list_of_ints will always have at least three integers.
 */
public class MaximumProductOf3 {
    /**
     * Does your function work with negative numbers?
     * If list_of_ints is [-10, -10, 1, 3, 2]
     * we should return 300 (which we get by taking -10 * -10 * 3).
     *
     * We can do this in O(n) time and O(1) space.
     * Option 1: iterate over the whole array 3 times O(n^3)
     * Option 2: Sort the array and take the highest 3 elements, but this
     *              only works for positive values
     * Option 3: Single scan, keep track of the two smallest numbers and
     *              the three largest values. If we needed to calculate the
     *              largest value of n items we could use a couple sorted
     *              arrays to these values.
     *
     * We can sort the array and then
     *
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("Invalid input array");
        }

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies between max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies between max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
