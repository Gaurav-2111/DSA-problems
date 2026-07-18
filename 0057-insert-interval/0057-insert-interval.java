import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for (int i = 0; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            // Case 1: Current interval is completely before newInterval
            if (e < start) {
                result.add(new int[]{s, e});
            }

            // Case 2: Current interval is completely after newInterval
            else if (s > end) {
                result.add(new int[]{start, end});
                start = s;
                end = e;
            }

            // Case 3: Overlapping intervals
            else {
                start = Math.min(start, s);
                end = Math.max(end, e);
            }
        }

        // Add the last interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}