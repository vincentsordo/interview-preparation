package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InflightEntertainmentTest {
    private InflightEntertainment inflightEntertainment;

    @Before
    public void init() {
        inflightEntertainment = new InflightEntertainment();
    }

    @Test
    public void testFalse() {
        int flightTime = 10;
        int [] movieLengths = new int[] {1,2,3,4,5};
        assertFalse(inflightEntertainment.movieLengthsEqualFlightTime(flightTime, movieLengths));
    }

    @Test
    public void testTrue() {
        int flightTime = 11;
        int [] movieLengths = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertTrue(inflightEntertainment.movieLengthsEqualFlightTime(flightTime, movieLengths));
    }
}