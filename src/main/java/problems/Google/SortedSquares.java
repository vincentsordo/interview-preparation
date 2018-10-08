package problems.Google;

/**
 * Google Interview Question
 *
 * Given an array of sorted doubles return an
 * array that is the square of equal double in
 * the input array.
 *
 */
public class SortedSquares {
    /**
     * Three possible solutions:
     *  1. iterate over array and square each element, then
     *      sort the array.
     *      - time: O(nlogn) because of sorting the array
     *      - space: O(n)  because of creating a new array
     *          optimization: you could store all the values in
     *          the initial array
     *  2. iterate over array, store negative squares in one array
     *      and positive squares in another array. Then reverse the
     *      negative array and merge into the positive array
     *      - time: O(n)
     *      - space: O(n)
     *          optimization: do all this calculation in the input
     *              array to reduce space to O(1) described here:
     *          http://akira.ruc.dk/~keld/teaching/algoritmedesign_f04/Artikler/04/Huang88.pdf
     *  3. start from the end of the array, iterate backwards. Use the
     *      reverse trick used in solution 2 to complete the comparison
     *      in one pass verses the 3 that are required for solution 2
     *      - time: O(n)
     *      - space: O(n)
     * @param sortedArray
     * @return
     */
    public int [] sortSolution2(int [] sortedArray) {
        // calculate the square of each element in place
        int negativeEndIndex = -1;
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] < 0) {
                negativeEndIndex = i;
            }
            sortedArray[i] = sortedArray[i] * sortedArray[i];
        }

        // if we have negative numbers then we need to reverse the elements
        if (negativeEndIndex >= 0) {
            int i = 0;
            int j = negativeEndIndex;
            while (i < j) {
                int temp = sortedArray[i];
                sortedArray[i++] = sortedArray[j];
                sortedArray[j--] = temp;
            }

            // merge the elements in place
            // negative array = 0 -> negativeEndIndex
            // positive array = negativeEndIndex + 1 -> sortedArray.length
            int [] sortedSquares = new int[sortedArray.length];
            int negativeIndex = 0;
            int positiveIndex = negativeEndIndex + 1;
            for (i = 0; i < sortedArray.length; i++) {
                if (negativeIndex <= negativeEndIndex &&
                    (positiveIndex == sortedArray.length || sortedArray[negativeIndex] < sortedArray[positiveIndex])) {
                    sortedSquares[i] = sortedArray[negativeIndex];
                    negativeIndex++;
                } else {
                    sortedSquares[i] = sortedArray[positiveIndex++];
                }
            }
            return sortedSquares;
        } else {
            return sortedArray;
        }
    }


    public int[] sortSolution3(int[] sortedArray)
    {
        int[] sortedSquare = new int[sortedArray.length];
        int front = 0;
        int back = sortedArray.length - 1;
        int currentPos = sortedArray.length - 1;
        while(front <= back)
        {
            int frontSq = sortedArray[front] * sortedArray[front];
            int backSq = sortedArray[back] * sortedArray[back];

            if(frontSq <= backSq)
            {
                sortedSquare[currentPos--] = backSq;
                --back;
            }
            else
            {
                sortedSquare[currentPos--] = frontSq;
                ++front;
            }
        }

        return sortedSquare;
    }
}
