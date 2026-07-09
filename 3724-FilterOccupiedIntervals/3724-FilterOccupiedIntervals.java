// Last updated: 7/9/2026, 10:06:22 AM
import java.util.*;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        // Step 1: Sort intervals by start time
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Merge overlapping or touching intervals
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : occupiedIntervals) {
            if (merged.isEmpty()) {
                merged.add(new int[]{interval[0], interval[1]});
            } else {
                int[] last = merged.get(merged.size() - 1);
                // If current interval touches or overlaps the last merged one, merge
                if (interval[0] <= last[1] + 1) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    merged.add(new int[]{interval[0], interval[1]});
                }
            }
        }

        // Step 3: Remove the free interval [freeStart, freeEnd] from merged intervals
        List<List<Integer>> result = new ArrayList<>();
        for (int[] interval : merged) {
            int start = interval[0];
            int end = interval[1];

            // Case 1: No overlap with free interval — keep as is
            if (end < freeStart || start > freeEnd) {
                result.add(Arrays.asList(start, end));
            } else {
                // Case 2: Left part before free interval
                if (start < freeStart) {
                    result.add(Arrays.asList(start, freeStart - 1));
                }
                // Case 3: Right part after free interval
                if (end > freeEnd) {
                    result.add(Arrays.asList(freeEnd + 1, end));
                }
                // If free interval completely covers this occupied interval,
                // both conditions are false → interval is discarded
            }
        }

        return result;
    }
}