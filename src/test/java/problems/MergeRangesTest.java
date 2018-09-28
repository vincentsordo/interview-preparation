package problems;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeRangesTest {
    private MergeRanges mergeRanges;
    private List<MergeRanges.Meeting> meetings;
    private List<MergeRanges.Meeting> mergedMeetings;

    @Before
    public void init() {
        /**
         * [(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)]
         * -> [(0, 1), (3, 8), (9, 12)]
         *
         * issue with my implementation is that I can not differentiate
         * between 8-9 and up to eight and then 9 up, meaning that 8-9 is open
         * in the above example
         */
        mergeRanges = new MergeRanges();
        meetings = new ArrayList<>();
        meetings.add(mergeRanges.new Meeting(0,1));
        meetings.add(mergeRanges.new Meeting(3,5));
        meetings.add(mergeRanges.new Meeting(4,8));
        meetings.add(mergeRanges.new Meeting(10,12));
        meetings.add(mergeRanges.new Meeting(9,10));

        mergedMeetings = new ArrayList<>();
        mergedMeetings.add(mergeRanges.new Meeting(0,1));
        mergedMeetings.add(mergeRanges.new Meeting(3,8));
        mergedMeetings.add(mergeRanges.new Meeting(9,12));
    }

    @Test
    public void testMergedRanges() {
        assertEquals(mergedMeetings, mergeRanges.mergeRanges(meetings));
    }
}