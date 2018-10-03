package problems;

public class ReverseAStringInPlace {
    // use case 1 - a b c
    //              0 1 2
    public void reverse(char[] characters) {
        if (characters == null) throw new IllegalArgumentException("Invalid char array");
        if (characters.length < 2) return;
        // i, pointer to 0
        // j, pointer to length - 1
        // switch the values and increment i and decrement j
        int i = 0;
        int j = characters.length - 1;
        while (i < j) {
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }
    }
}
