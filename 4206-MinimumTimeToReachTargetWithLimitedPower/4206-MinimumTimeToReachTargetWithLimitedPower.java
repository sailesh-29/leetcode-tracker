// Last updated: 7/9/2026, 10:06:17 AM
import java.util.*;

class Solution {
    public long[] minTimeMaxPower(int n, int[][] edges, int power, int[] cost, int source, int target) {
        // Trivial case: source == target
        if (source == target) {
            return new long[]{0, power};
        }
        
        // Build adjacency list
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }
        
        // dist[node][p] = minimum time to reach node with exactly p remaining power
        // Use Long.MAX_VALUE to represent unreachable
        long[][] dist = new long[n][power + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }
        
        // Priority queue: [time, node, remainingPower]
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        dist[source][power] = 0;
        pq.offer(new long[]{0, source, power});
        
        long minTime = Long.MAX_VALUE;
        
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long curTime = cur[0];
            int u = (int) cur[1];
            long curPower = cur[2];
            
            // Prune: if this time is already worse than best found, skip
            if (curTime > minTime) break;
            
            // If we reached target, track the minimum time
            if (u == target) {
                minTime = Math.min(minTime, curTime);
                continue;
            }
            
            // Out of power — can't forward from this node
            if (curPower < cost[u]) continue;
            
            // Skip if this state is outdated
            if (curTime != dist[u][(int) curPower]) continue;
            
            long nextPower = curPower - cost[u];
            
            for (int[] edge : graph[u]) {
                int v = edge[0];
                long nextTime = curTime + edge[1];
                
                if (nextTime < dist[v][(int) nextPower]) {
                    dist[v][(int) nextPower] = nextTime;
                    pq.offer(new long[]{nextTime, v, nextPower});
                }
            }
        }
        
        // If target unreachable
        if (minTime == Long.MAX_VALUE) {
            return new long[]{-1, -1};
        }
        
        // Find max remaining power among paths achieving the minimum time
        long maxPower = -1;
        for (int p = 0; p <= power; p++) {
            if (dist[target][p] == minTime) {
                maxPower = Math.max(maxPower, p);
            }
        }
        
        return new long[]{minTime, maxPower};
    }
}