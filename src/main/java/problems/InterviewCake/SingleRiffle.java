package problems.InterviewCake;

import java.util.Arrays;

/**
 * Write a method to tell us if a full deck of cards shuffledDeck
 * is a single riffle of two other halves half1 and half2.
 *
 * We'll represent a stack of cards as an array of integers in
 * the range 1..521..52 (since there are 5252 distinct cards in a deck).
 */
public class SingleRiffle {
    /**
     * Space Complexity: O(n^2) - call stack
     * Time Complexity: O(n^2) - Arrays.copyOfRange takes O(n) time
     * @param half1
     * @param half2
     * @param shuffledDeck
     * @return
     */
    public boolean isSingleRiffleOption1(int[] half1, int[] half2, int[] shuffledDeck) {
        if (shuffledDeck.length == 0) {
            return true;
        }

        if (half1.length > 0 && half1[0] == shuffledDeck[0]) {
            return isSingleRiffleOption1(removeTopCard(half1), half2, removeTopCard(shuffledDeck));
        } else if (half2.length > 0 && half2[0] == shuffledDeck[0]) {
            return isSingleRiffleOption1(half1, removeTopCard(half2), removeTopCard(shuffledDeck));
        } else {
            return false;
        }
    }

    /**
     * @param deck
     * @return
     */
    private int[] removeTopCard(int [] deck) {
        return Arrays.copyOfRange(deck, 1, deck.length);
    }

    /**
     * Space: O(n)
     * Time: O(n)
     * @param half1
     * @param half2
     * @param shuffledDeck
     * @param half1Idx
     * @param half2Idx
     * @param shuffleDeckIdx
     * @return
     */
    public boolean isSingleRiffleOption2(
            int [] half1, int [] half2, int [] shuffledDeck,
            int half1Idx, int half2Idx, int shuffleDeckIdx) {
        if (shuffledDeck.length == shuffleDeckIdx) {
            return true;
        }

        if (half1Idx < half1.length && half1[half1Idx] == shuffledDeck[shuffleDeckIdx]) {
            half1Idx++;
        } else if (half2Idx < half2.length && half2[half2Idx] == shuffledDeck[shuffleDeckIdx]) {
            half2Idx++;
        } else {
            return false;
        }

        shuffleDeckIdx++;
        return isSingleRiffleOption2(half1, half2, shuffledDeck, half1Idx, half2Idx, shuffleDeckIdx);

    }

    /**
     * Space: O(1)
     * Time: O(n)
     * @param half1
     * @param half2
     * @param shuffledDeck
     * @return
     */
    public boolean isSingleRiffleOption3(int [] half1, int [] half2, int [] shuffledDeck) {
        int half1Idx = 0;
        int half2Idx = 0;

        for (int card : shuffledDeck) {
            if (half1Idx < half1.length && half1[half1Idx] == card) {
                half1Idx++;
            } else if (half2Idx < half2.length && half2[half2Idx] == card) {
                half2Idx++;
            } else {
                return false;
            }
        }

        return true;
    }
}
