package problems.InterviewCake;

import java.util.Random;

/**
 * Write a method for doing an in-place ↴ shuffle of an array.
 *
 * The shuffle must be "uniform," meaning each item in the
 * original array must have the same probability of ending up
 * in each spot in the final array.
 *
 * Assume that you have a method getRandom(floor, ceiling) for
 * getting a random integer that is >= floor and <= ceiling.
 */
public class FisherYatesShuffle {

    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }

    // O(n) time and O(1) space.
    public static void shuffle(int[] theArray) {

        // if it's 1 or 0 items, just return
        if (theArray.length <= 1) {
            return;
        }

        // walk through from beginning to end
        for (int indexWeAreChoosingFor = 0;
             indexWeAreChoosingFor < theArray.length - 1; indexWeAreChoosingFor++) {

            // choose a random not-yet-placed item to place there
            // (could also be the item currently in that spot)
            // must be an item AFTER the current item, because the stuff
            // before has all already been placed
            int randomChoiceIndex = getRandom(indexWeAreChoosingFor, theArray.length - 1);

            // place our random choice in the spot by swapping
            if (randomChoiceIndex != indexWeAreChoosingFor) {
                int valueAtIndexWeChoseFor = theArray[indexWeAreChoosingFor];
                theArray[indexWeAreChoosingFor] = theArray[randomChoiceIndex];
                theArray[randomChoiceIndex] = valueAtIndexWeChoseFor;
            }
        }
    }
}
