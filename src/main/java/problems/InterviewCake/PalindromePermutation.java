package problems.InterviewCake;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    /**
     * A palindrome permutation has 1 character 1 time,
     * and/or all other characters 2 times
     *
     *
     * @param input
     * @return
     */
    public boolean hasPalindromePermutation(String input) {
        Set<Character> unpairedCharacters = new HashSet<>();

        for (Character c : input.toCharArray()) {
            if (unpairedCharacters.contains(c)) {
                unpairedCharacters.remove(c);
            } else {
                unpairedCharacters.add(c);
            }
        }

        return unpairedCharacters.size() <= 1;
    }
}
