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
     *  2. The approach is similar to a binary search, except we
     *      divide the range of possible answers in half at each step,
     *      rather than dividing the array in half.
     *          time: O(nlogn)
     *          space: O(1)
     *  3. Iterate over array, for each value set it to negative,
     *      then if you find another value that is negative out of
     *      integers 1 -> n, then you have found your duplicate.
     *          time: O(n)
     *          space: O(1)
     *          tradeoff: this manipulates the input array
     * @param inputArray
     * @return
     */
    public int findDuplicateWithModification(int[] inputArray) {
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

    /**
     * 1. the integers are in the range 1..n
     * 2. the array has a length of n+1
     *
     * According to Gauss calulcation the sum of all
     * the natural number from 1 to n is n(n+1) / 2
     *
     * time: O(n) space: O(1)
     *
     * @param inputArray
     * @return
     */
    public int findDuplicateWithoutModification(int [] inputArray) {
        int n = inputArray.length - 1;
        int gaussSum = (n * (n+1)) / 2;
        int arrSum = 0;
        for (int value : inputArray) {
            arrSum += value;
        }

        return arrSum - gaussSum;
    }
}
