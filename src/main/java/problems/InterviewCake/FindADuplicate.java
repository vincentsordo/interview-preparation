package problems.InterviewCake;

/**
 * Find an integer that shows up more than once
 * optimizing for space. The values are between
 * 1 and n, the array length is n + 1
 *
 * Example:
 */
public class FindADuplicate {
    /**
     * Solutions:
     *  1. iterate over the array twice O(n^2) to find duplicate
     *      time: O(n^2)
     *      space: O(1)
     *  2. Iterate over array, for each value set it to negative,
     *      then if you find another value that is negative out of
     *      integers 1 -> n, then you have found your duplicate.
     *          time: O(n)
     *          space: O(1)
     * @param inputArray
     * @return
     */
    public int findDuplicate(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int absValue = Math.abs(inputArray[i]);
            if (inputArray[absValue] >= 0) {
                inputArray[absValue] = -inputArray[absValue];
            } else {
                return Math.abs(inputArray[i]);
            }
        }

        // no duplicates found
        return -1;
    }
}
