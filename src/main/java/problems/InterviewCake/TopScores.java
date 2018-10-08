package problems.InterviewCake;

/**
 * Write a method that takes:
 *      1. an array of unsortedScores
 *      2. the highestPossibleScore in the game
 *      3. and returns a sorted array of scores in less
 *          than O(nlogn) time
 *
 * For example:
 *      int[] unsortedScores = {37, 89, 41, 65, 91, 53};
 *      final int HIGHEST_POSSIBLE_SCORE = 100;
 *
 *      int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
 *      // sortedScores: [91, 89, 65, 53, 41, 37]
 */
public class TopScores {
    /**
     * Create an array of highestScore + 1. Iterate over scores and
     * add score to index of array. For each index of sorted array
     * add that number of indexes to the unsorted array
     *  time: O(n)
     *  space: O(n)
     * @param unsortedScores
     * @return
     */
    public int[] sortScores(int [] unsortedScores, int highestScorePossible) {
        int [] sortedScores = new int[highestScorePossible + 1];
        for (int unsortedScore : unsortedScores) {
            sortedScores[unsortedScore]++;
        }

        int currentSortedScoresIdx = 0;
        for (int sortedScoreIdx = highestScorePossible; sortedScoreIdx >= 0; sortedScoreIdx--) {
            for (int count = sortedScores[sortedScoreIdx]; count > 0; count--) {
                unsortedScores[currentSortedScoresIdx++] = sortedScoreIdx;
            }
        }

        return unsortedScores;
    }
}
