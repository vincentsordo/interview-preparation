package problems.InterviewCake;

/**
 * Write an efficient method that checks whether the input string
 * is a permutation of the original string
 */
public class Permutation {

    /**
     * You can assume the input string only contains lowercase letters.
     *
     * 26 possible characters/letters
     * option 1 - array of 26 values, increment the count for each letter,
     * compare the count against the input string's count
     *      time: O(n) and space: O(1) - because the extra array will always be 26 elements
     * option 2 - iterate over the original string's characters, sum up the character values
     *  compare original string sum to input string sum
     *  time: O(n) and space O(1)
     *  downside versus option 1 is that you will always have to iterate over the whole string,
     *  while option 1 allows you to break out once you find a count that is greater than the original
     *  string
     *
     *
     *  Example:
     *      civic, ivicc - true
     *      civic, civil - false
     *
     * @param originalString
     * @param input
     * @return
     */
    public boolean isPermutationOption1(String originalString, String input) {
        if (originalString.length() != input.length()) {
            return false;
        }

        int [] arr = new int[26];
        //O(n)
        for (Character c : originalString.toCharArray()) {
            int arrIdx = c - 'a';
            arr[arrIdx]++;
        }

        // worst case O(n)
        // best case O(1)
        for (Character c : input.toCharArray()) {
            int arrIdx = c - 'a';
            arr[arrIdx]--;
            if (arr[arrIdx] < 0) {
                return false;
            }
        }

        return true;
    }

}
