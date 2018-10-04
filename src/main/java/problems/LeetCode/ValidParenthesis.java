package problems.LeetCode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Companies: Facebook, Microsoft, Google, Twiiter, Uber, Lift
 * Caveats: Use a stack and don't forget about an empty stack
 */
public class ValidParenthesis {
    /**
     * Time: O(n)
     * Space: O(n)
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (isValidCharacter(stack, c)) {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.empty();
    }

    private boolean isValidCharacter(Stack<Character> stack, Character c) {
        return !stack.empty() &&
                ((c == ')' && stack.peek() == '(') ||
                        (c == ']' && stack.peek() == '[') ||
                        (c == '}' && stack.peek() == '{'));
    }
}
