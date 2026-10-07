// Last updated: 10/7/2026, 6:42:41 PM
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3        int first = Integer.MAX_VALUE;
4        int second = Integer.MAX_VALUE;
5
6        for (int num : nums) {
7            if (num <= first) {
8                first = num;
9            } 
10            else if (num <= second) {
11                second = num;
12            } 
13            else {
14                return true;
15            }
16        }
17
18        return false;
19    }
20}