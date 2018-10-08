package problems.InterviewCake;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Your company built an in-house calendar tool called HiCal.
 * You want to add a feature to see the times in a day when
 * everyone is available.
 *
 * To do this, you’ll need to know when any team is having a
 * meeting. In HiCal, a meeting is stored as an object of a
 * Meeting class with integer variables startTime and endTime.
 * These integers represent the number of 30-minute blocks past 9:00am.
 *
 * Example:
 *        [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]
 *    ->  [Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]
 */
public class MergeMeetingTimes {
    public List<Meeting> mergeRanges(List<Meeting> meetings) {
        List<Meeting> mergedMeetings = new ArrayList<>();

        meetings.sort(new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.getStartTime() - o2.getStartTime();
            }
        });

        mergedMeetings.add(meetings.get(0));
        for (Meeting currentMeeting : meetings) {
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
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
        public boolean equals(Object other) {
            Meeting otherMeeting = (Meeting) other;
            return otherMeeting.startTime == this.startTime &&
                    otherMeeting.endTime == this.endTime;
        }
    }
}
