package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotationPointTest {
    RotationPoint rotationPoint;

    @Before
    public void setUp() {
        rotationPoint = new RotationPoint();
    }

    @Test
    public void getRotationPoint() {
        String[] words = new String[]{
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "yaml",
                "zooo",
                "asymptote",  // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage",
        };
        assertEquals(7, rotationPoint.getRotationPointIndex(words));
    }
}