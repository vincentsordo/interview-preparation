package problems.LeetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {
    ValidParenthesis validParenthesis;

    @Before
    public void init() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    public void testIsValid() {
        assertTrue(validParenthesis.isValid(""));
        assertTrue(validParenthesis.isValid("()"));
        assertTrue(validParenthesis.isValid("()[]{}"));
        assertTrue(validParenthesis.isValid("{[]}"));
        assertFalse(validParenthesis.isValid("(]"));
        assertFalse(validParenthesis.isValid("([)]"));
        assertFalse(validParenthesis.isValid("([]){"));
    }
}