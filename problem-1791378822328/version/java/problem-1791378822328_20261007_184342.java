// Last updated: 10/7/2026, 6:43:42 PM
1class Solution {
2    public int compress(char[] chars) {
3        int write = 0;
4        int read = 0;
5
6        while (read < chars.length) {
7            char current = chars[read];
8            int count = 0;
9
10            // Count consecutive characters
11            while (read < chars.length && chars[read] == current) {
12                read++;
13                count++;
14            }
15
16            // Write the character
17            chars[write++] = current;
18
19            // Write count if greater than 1
20            if (count > 1) {
21                String str = String.valueOf(count);
22
23                for (char c : str.toCharArray()) {
24                    chars[write++] = c;
25                }
26            }
27        }
28
29        return write;
30    }
31}