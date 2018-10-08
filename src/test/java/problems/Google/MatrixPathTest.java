package problems.Google;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixPathTest {
    MatrixPath matrixPath;

    @Before
    public void setUp() {
        int [][] newMatrix = new int[][] {
                {1,1,1,0,1,1,1,0,1},
                {0,0,1,1,1,0,1,1,0},
                {1,0,1,0,0,0,0,1,1},
                {0,0,1,1,1,1,1,0,1}
        };
        matrixPath = new MatrixPath(newMatrix, 0, 0, 3, 8);
    }

    @Test
    public void isPath() {
        assertTrue(matrixPath.isPath());
    }
}