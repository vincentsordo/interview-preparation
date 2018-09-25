package algorithms;

/**
 * Counting sort is a very time-efficient (and somewhat space-inefficient) algorithm
 * for sorting that avoids comparisons and exploits the O(1)O(1) time insertions and
 * lookups in an array.
 *
 * The idea is simple: if you're sorting  integers and you know they all fall in the
 * range 1..1001..100, you can generate a sorted array this way:
 *
 * 1. Allocate an array numCounts where the indices represent numbers from our input
 *    array and the values represent how many times the index number appears. Start
 *    each value at 0.
 * 2. In one pass of the input array, update numCounts as you go, so that at the end
 *    the values in numCounts are correct.
 * 3. Allocate an array sortedArray where we'll store our sorted numbers.
 * 4. In one in-order pass of numCounts put each number, the correct number of times,
 *    into sortedArray.
 */
public class CountingSort {
    /**
     * Assumption is that we are not working with negative numbers and
     * that the array is between 1 and maxValue
     *
     * @param inputArray
     * @param maxValue
     * @return int[]
     */
    public int[] sort(int [] inputArray, int maxValue) {
        int numCounts[] = new int[maxValue + 1];

        for (int i : inputArray) {
            numCounts[i]++;
        }

        int sortedArray[] = new int[inputArray.length];
        int currentSortedIdx = 0;

        for (int num = 0; num < numCounts.length; num++) {
            int numCount = numCounts[num];

            for (int i = 0; i < numCount; i++) {
                sortedArray[currentSortedIdx] = num;
                currentSortedIdx++;
            }
        }

        return sortedArray;
    }
}
