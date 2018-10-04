package problems.LinkedIn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LinkedIn Technical Interview Problem
 *
 * Given a class, TwoSum, with two methods:
 *      1. store - store int
 *      2. test - determine if the sum of two elements in data structure
 *                equals the value passed to the test method
 * Create a data structure and implement the two methods:
 *
 * Questions:
 * - Do we wanted to optimize the solution for run time
 * or space? Answer: runtime
 * - Do we want to optimize for the store or test method? Answer: test method
 * Solution 1: Store all valuesList in a list, and store all the sumsSet in a hashmap,
 *              For each store call calculate the sum of the new value with all
 *              valuesList in the array and add to the sumsSet set
 *              The test method will be a one liner of checking the set for the sum
 *              existing
 * Time: O(1) - constant lookup
 * Space: O(n^2) - adding n^2 elements to the Set
 *
 * Solution 2, with caveat to reduce the space to less than n^2, if we care about space
 * then we can enhance this solution (time=O(n), space=O(n)) by using a set to store the
 * valuesList of our array then iterate over each value in the set and see if a corresponding
 * sum - value exists in the set
 *
 */
public class TwoSum {
    // O(n^2)
    Set<Integer> sumsSet = new HashSet<>();
    // O(n)
    List<Integer> valuesList = new ArrayList<>();

    Set<Integer> valuesSet = new HashSet<>();

    // Solution 1, time: O(1) space: O(n^2)
    /**
     * Stores @param input in an internal data structure.
     */
    void Solution1Store(int input) {
        for (Integer value: valuesList) {
            sumsSet.add(input + value);
        }
        valuesList.add(input);
    }

    /**
     * Returns true if there is any pair of numbers in the internal data structure which
     * have sum @param val, and false otherwise.
     * For example, if the numbers 1, -2, 3, and 6 had been stored,
     * the method should return true for 4, -1, and 9, but false for 10, 5, and 0
     */
    boolean Solution1Test(int val) {
        return sumsSet.contains(val);
    }

    // Solution 2, time: O(n) space: O(n)
    /**
     * Stores @param input in an internal data structure.
     */
    void Solution2Store(int input) {
        valuesSet.add(input);
    }

    /**
     * Returns true if there is any pair of numbers in the internal data structure which
     * have sum @param val, and false otherwise.
     * For example, if the numbers 1, -2, 3, and 6 had been stored,
     * the method should return true for 4, -1, and 9, but false for 10, 5, and 0
     */
    boolean Solution2Test(int val) {
        for (Integer setValue : valuesSet) {
            if (valuesSet.contains(val - setValue)) return true;
        }
        return false;
    }
}
