package problems.LeetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosTest {

    private MoveZeros moveZeros;

    @Before
    public void setUp(){
        moveZeros = new MoveZeros();
    }

    @Test
    public void moveZeroes() {
        int [] test1 = new int[] {0,1,0,3,12};
        moveZeros.moveZeroes(test1);
        assertArrayEquals(new int[] {1,3,12,0,0}, test1);
    }
}