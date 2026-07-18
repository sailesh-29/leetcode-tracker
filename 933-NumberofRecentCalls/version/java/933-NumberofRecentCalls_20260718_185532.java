// Last updated: 7/18/2026, 6:55:32 PM
1class RecentCounter {
2    Queue<Integer> queue;
3    public RecentCounter() {
4        queue = new LinkedList<>();
5    }
6    
7    public int ping(int t) {
8        queue.offer(t);
9        while(queue.peek()<t-3000){
10            queue.poll();
11        }
12        return queue.size();
13    }
14}
15
16/**
17 * Your RecentCounter object will be instantiated and called as such:
18 * RecentCounter obj = new RecentCounter();
19 * int param_1 = obj.ping(t);
20 */