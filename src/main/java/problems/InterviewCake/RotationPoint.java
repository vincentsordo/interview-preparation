package problems.InterviewCake;

/**
 * Given a list of rotated sorted strings
 * return the rotation point (start of the list).
 *
 * Example:
 *    String[] words = new String[]{
 *     "ptolemaic",
 *     "retrograde",
 *     "supplant",
 *     "undulate",
 *     "xenoepist",
 *     "asymptote",  // <-- rotates here!
 *     "babka",
 *     "banoffee",
 *     "engender",
 *     "karpatka",
 *     "othellolagkage",
 * };
 */
public class RotationPoint {

    /**
     * This is a good opportunity to use binary search
     * We can split the array in the middle and search for
     * the smallest element.
     *
     * @param words
     * @return
     */
    public int getRotationPointIndex(String[] words) {
        String firstWord = words[0];
        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            int guessIndex = start + ((end - start) / 2);
            if (words[guessIndex].compareTo(firstWord) >= 0) {
                start = guessIndex;
            } else {
                end = guessIndex;
            }

            if (start + 1 == end) {
                break;
            }
        }

        return end;
    }
}
