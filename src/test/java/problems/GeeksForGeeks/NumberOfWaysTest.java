package problems.GeeksForGeeks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfWaysTest {
    NumberOfWays numberOfWays;

    @Before
    public void setUp() throws Exception {
        numberOfWays = new NumberOfWays();
    }

    @Test
    public void getNumberOfWays() {
        assertEquals(14, numberOfWays.getNumberOfWays(7));
    }
}