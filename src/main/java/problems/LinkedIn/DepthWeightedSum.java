package problems.LinkedIn;

import java.util.List;

/**
 * LinkedIn Technical Interview Problem
 */
public class DepthWeightedSum {
    /**
     * This is the interface that represents nested lists.
     * You should not implement it, or speculate about its implementation.
     */
    public interface NestedInteger
    {
        /** @return true if this NestedInteger holds a single integer, rather than a nested list */
        boolean isInteger();

        /** @return the single integer that this NestedInteger holds, if it holds a single integer
         * Return null if this NestedInteger holds a nested list */
        Integer getInteger();

        /** @return the nested list that this NestedInteger holds, if it holds a nested list
         * Return null if this NestedInteger holds a single integer */
        List<NestedInteger> getList();
    }


    /**
     * Given a nested list of integers, returns the sum of all integers in the list weighted by their depth
     * For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1)
     * Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, and one 6 at depth 3)

     {{1,1},2,{1,1}}
     2*1 + 2*1
     2 2  1  2 2
     =2 + 2 + 2 + 2 + 2 = 10

     {1,{4,{6}}}


     */
    public int depthSum(List<NestedInteger> input)
    {
        if (input.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (NestedInteger n : input) {
            sum += recursion(1, n);
        }

        return sum;
    }

    private int recursion(int depth, NestedInteger n) {
        if (n.isInteger()) {
            return depth * n.getInteger();
        } else {
            int sum = 0;
            depth++;
            for (NestedInteger nestedInteger : n.getList()) {
                sum += recursion(depth, nestedInteger);
            }
            return sum;
        }
    }
}
