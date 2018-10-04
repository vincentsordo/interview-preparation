package problems.InterviewCake;

/**
 * Solve a simpler version of the problem (in this case, reversing the characters instead of the words),
 * and see if that gets us closer to a solution for the original problem
 */
public class ReverseWords {
    public void reverse(char [] message) {
        /*
           {
           'c','a' 't' ' '
           't' 'h' 'e'

           1
           e h t ' '
           t a c

           2
           the ' '
           cat


           2 we reverse each word
           time - O(n) space - 0(1)
           };
         */

        // 1 we reverse all characters, 1 iteration
        reverseString(message, 0, message.length - 1);

        // 2 iterate over string an look for spaces
        int leftIdx = 0;
        for (int rightIdx = 0; rightIdx <= message.length; rightIdx++) {
            // reached the end of the message or a space
            if (rightIdx == message.length || message[rightIdx] == ' ') {
                reverseString(message, leftIdx, rightIdx - 1);
                leftIdx = rightIdx + 1;
            }
        }
    }

    public void reverseString(char [] message, int leftIdx, int rightIdx) {
        if (message == null) throw new IllegalArgumentException("Invalid char array");
        if (message.length < 2) return;
        // i, pointer to 0
        // j, pointer to length - 1
        // switch the values and increment i and decrement j
        int i = leftIdx;
        int j = rightIdx;
        while (i < j) {
            char temp = message[i];
            message[i++] = message[j];
            message[j--] = temp;
        }
    }
}
