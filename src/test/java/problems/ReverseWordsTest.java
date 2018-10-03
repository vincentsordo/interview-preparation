package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {
    private ReverseWords reverseWords;

    @Before
    public void init() {
        reverseWords = new ReverseWords();
    }

    @Test
    public void testReverse() {
        char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };
        char[] reversedMessage = {
                's', 't', 'e', 'a', 'l',' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                'c', 'a', 'k', 'e'
        };
        reverseWords.reverse(message);
        assertArrayEquals(message, reversedMessage);
    }
}