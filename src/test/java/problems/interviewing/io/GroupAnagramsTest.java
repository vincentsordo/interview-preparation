package problems.interviewing.io;

import org.junit.Before;
import org.junit.Test;
import problems.Inteviewing.io.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupAnagramsTest {
    private GroupAnagrams groupAnagrams;
    private String [] inputArray;
    private List<List<String>> expectedList;

    @Before
    public void init() {
        groupAnagrams = new GroupAnagrams();
        inputArray = new String[] {"eat","tea","tan","ate","nat","bat"};
        expectedList = new ArrayList<>();
        expectedList.add(Collections.singletonList("bat"));
        expectedList.add(Arrays.asList("tan","nat"));
        expectedList.add(Arrays.asList("eat","tea","ate"));
    }

    @Test
    public void testGroupAnagrams() {
        assertTrue(expectedList.contains(groupAnagrams.groupAnagrams(inputArray).get(0)));
        assertTrue(expectedList.contains(groupAnagrams.groupAnagrams(inputArray).get(1)));
        assertTrue(expectedList.contains(groupAnagrams.groupAnagrams(inputArray).get(2)));
    }

    @Test
    public void testGroupAnagramsWithCharacterCounts() {
        assertEquals(expectedList, groupAnagrams.groupAnagramsUsingCharacterCount(inputArray));
    }
}