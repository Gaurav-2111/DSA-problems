import java.util.*;

class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
        boolean inserted = false;

        // Step 1: Insert newInterval in the correct position
        for (int[] interval : intervals) {

            if (!inserted && newInterval[0] < interval[0]) {
                list.add(newInterval);
                inserted = true;
            }

            list.add(interval);
        }

        // If newInterval belongs at the end
        if (!inserted) {
            list.add(newInterval);
        }

        // Step 2: Merge the sorted intervals
        List<int[]> result = new ArrayList<>();

        int[] current = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            int[] next = list.get(i);

            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}