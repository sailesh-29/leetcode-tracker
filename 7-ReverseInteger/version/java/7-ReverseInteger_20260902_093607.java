// Last updated: 9/2/2026, 9:36:07 AM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4        while (x != 0) {
5            int pop = x % 10;  
6            x /= 10;          
7            if (rev > Integer.MAX_VALUE / 10 ||
8                (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
9                return 0;
10            }
11            if (rev < Integer.MIN_VALUE / 10 ||
12                (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
13                return 0;
14            }
15
16            rev = rev * 10 + pop;
17        }
18        
19        return rev;
20    }
21}