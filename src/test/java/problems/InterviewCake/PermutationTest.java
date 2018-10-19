package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    Permutation permutation;

    @Before
    public void setUp() throws Exception {
        permutation = new Permutation();
    }

    @Test
    public void isPermutationOption1() {
        assertTrue(permutation.isPermutationOption1("civic", "ivicc"));
        assertFalse(permutation.isPermutationOption1("civic", "civil"));
    }
}