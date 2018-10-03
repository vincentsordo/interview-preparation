package problems;

public class MergeSortedArrays {
    /**
     * Time: O(n)
     * Space: O(n)
     * @param array1
     * @param array2
     * @return
     */
    public int[] merge(int[] array1, int[] array2) {
        int mergedArraySize = array1.length+array2.length;
        int [] mergedArray = new int[mergedArraySize];
        int array1Idx = 0;
        int array2Idx = 0;
        int mergedArrayIdx = 0;
        while (mergedArrayIdx < mergedArraySize) {
            if (array1Idx < array1.length &&
                (array2Idx == array2.length || array1[array1Idx] < array2[array2Idx])) {
                mergedArray[mergedArrayIdx] = array1[array1Idx];
                mergedArrayIdx++;
                array1Idx++;
            } else if (array2Idx < array2.length &&
                (array1Idx == array1.length || array1[array1Idx] >= array2[array2Idx])) {
                mergedArray[mergedArrayIdx] = array2[array2Idx];
                mergedArrayIdx++;
                array2Idx++;
            }
        }

        return mergedArray;
    }
}
