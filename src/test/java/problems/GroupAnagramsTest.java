package problems;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {
    private GroupAnagrams groupAnagrams;

    @Before
    public void init() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void testGroupAnagrams() {
        String [] inputList = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList("eat","tea","ate"));
        expectedList.add(Collections.singletonList("bat"));
        expectedList.add(Arrays.asList("tan","nat"));

        assertEquals(expectedList, groupAnagrams.groupAnagrams(inputList));
    }
}