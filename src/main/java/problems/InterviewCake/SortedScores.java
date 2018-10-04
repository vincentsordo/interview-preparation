package problems.InterviewCake;

public class SortedScores {
    public int[] sort(int[] unsortedArray, int highestScore) {
        // use an array to store the values that is size highestScore
        int [] scoreCounts = new int[highestScore + 1];
        for (int i : unsortedArray) {
            scoreCounts[i]++;
        }

        int [] sortedArray = new int[unsortedArray.length];
        int sortedArrayIdx = 0;

        for (int score = highestScore; score >= 0; score--) {
            int count = scoreCounts[score];
            for (int occurrence = 0; occurrence < count; occurrence++) {
                sortedArray[sortedArrayIdx++] = score;
            }
        }

        return sortedArray;
    }
}
