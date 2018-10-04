package problems.LeetCode;

/**
 * 268. Missing Number
 *
 * Given an array containing n distinct numbers taken from
 * 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Companies: Amazon and Google
 *
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
    /**
     Two possible solutions:
     1. Use set to keep track of the numbers. Then iterate over the set to find the missing number.
     2. Use Gauss' law. Sum of 0 -> n = (n * (n-1)) / 2
     */
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int n = nums.length + 1;
        return (n * (n-1) / 2) - sum;
    }
}
