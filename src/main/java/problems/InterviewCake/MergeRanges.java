package problems.InterviewCake;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 * To do this, you’ll need to know when any team is having a meeting.
 * In HiCal, a meeting is stored as an object of a Meeting class with
 * integer variables startTime and endTime. These integers represent
 * the number of 30-minute blocks past 9:00am.
 *
 * For example:
 *
 *   new Meeting(2, 3);  // meeting from 10:00 – 10:30 am
 *   new Meeting(6, 9);  // meeting from 12:00 – 1:30 pm
 *
 * Write a method mergeRanges() that takes a list of multiple meeting
 * time ranges and returns a list of condensed ranges.
 *
 * For example, given:
 *
 *   [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]
 *
 * your method would return:
 *
 *   [Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]
 *
 */
public class MergeRanges {
    public List<Meeting> mergeRanges(List<Meeting> meetings) {

        // make a copy so we don't destroy the input
        List<Meeting> sortedMeetings = new ArrayList<>();
        for (Meeting meeting: meetings) {
            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
            sortedMeetings.add(meetingCopy);
        }

        // sort by start time
        Collections.sort(sortedMeetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        // initialize mergedMeetings with the earliest meeting
        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        for (Meeting currentMeeting : sortedMeetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            // if the current meeting overlaps with the last merged meeting, use the
            // later end time of the two
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

                // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }

    /**
     * 30 minute increments past 9:00AM
     * 48 possible meetings that are 30 minutes
     *
     * (0, 1), (3, 5), (4, 8), (10, 12), (9, 10)
     *
     * [(0, 1), (3, 8), (9, 12)]
     *
     * [0,1,2,3,4,6,7,8,9,10,11,12]
     *
     *
     *
     * @param meetings
     * @return
     */
    public List<Meeting> mergeRangesEnhancement(List<Meeting> meetings) {
        // create an array of 48 elements
        // for each start and end time we insert a 1 into the array
        // iterate over the newly populated array and create new list from start of 1's to end of 1's
        // 9:00 -> 9:30 -> 10:00 -> 10:30 -> 11:00 -> 11:30 -> 12:00 -> 12:30 -> 13:30 -> 14:00 -> 14:30 -> 15:00 -> 15:30
        //   0  ->  1   ->   2   ->   3   ->   4   ->   5   ->   6   ->   7   ->   8   ->   9   ->   10  ->   11  ->   12
        //   0  ->  1                 3        4        5                          8        9        10                12

        boolean [] meetingRanges = new boolean [96];
        for (Meeting meeting : meetings) {
            int startTime = meeting.getStartTime();
            int endTime = meeting.getEndTime();
            while (startTime <= endTime) {
                if (!meetingRanges[startTime]) {
                    meetingRanges[startTime] = true;
                }
                startTime++;
            }
        }

        List<Meeting> ranges = new ArrayList<>();
        // [0,1,2,3,4,5,6,7,8,9,10,11,12]
        // [1,1,0,1,1,1,1,1,1,0, 1, 1, 1]
        int startIdx = -1;
        int endIdx = -1;
        for (int i = 0; i < meetingRanges.length; i++) {
            if (meetingRanges[i]) {
                if (startIdx < 0) {
                    startIdx = i;
                }
                endIdx = i;
            } else if (startIdx >= 0 && startIdx != endIdx) {
                Meeting meeting = new Meeting(startIdx, endIdx);
                ranges.add(meeting);
                startIdx = endIdx = -1;
            }
        }

        if (meetingRanges[meetingRanges.length - 1] && startIdx >= 0) {
            Meeting meeting = new Meeting(startIdx, endIdx);
            ranges.add(meeting);
        }


        return ranges;
    }

    public class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime   = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Meeting)) return false;

            Meeting anotherMeeting = (Meeting) o;

            return anotherMeeting.startTime == this.startTime &&
                    anotherMeeting.endTime == this.endTime;
        }
    }
}
