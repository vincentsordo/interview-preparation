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
    private String [] inputArray;
    private List<List<String>> expectedList;

    @Before
    public void init() {
        groupAnagrams = new GroupAnagrams();
        inputArray = new String[] {"eat","tea","tan","ate","nat","bat"};
        expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList("eat","tea","ate"));
        expectedList.add(Collections.singletonList("bat"));
        expectedList.add(Arrays.asList("tan","nat"));
    }

    @Test
    public void testGroupAnagrams() {
        assertEquals(expectedList, groupAnagrams.groupAnagrams(inputArray));
    }

    @Test
    public void testGroupAnagramsWithCharacterCounts() {
        assertEquals(expectedList, groupAnagrams.groupAnagramsUsingCharacterCount(inputArray));
    }
}