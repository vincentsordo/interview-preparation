package problems.LeetCode;

/**
 * 136. Single Number
 *
 * Given a non-empty array of integers, every element appears
 * twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class SingleNumber {
    /**
     * Use XOR. n ^ n = 0, n ^ 0 = n
     *
     * Companies: Alibaba, Amazon, Google
     */
    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int num : nums) {
            singleNumber ^= num;
        }

        return singleNumber;
    }
}
