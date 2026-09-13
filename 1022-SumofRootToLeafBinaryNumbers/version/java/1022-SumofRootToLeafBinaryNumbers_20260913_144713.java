// Last updated: 9/13/2026, 2:47:13 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3       HashMap<Character,Integer> map = new HashMap<>();
4       int left=0;
5       int right=0;
6       int maxLen=0;
7       while(right<s.length()){
8            char c = s.charAt(right);
9            map.put(c,map.getOrDefault(c,0)+1);
10            right++;
11            while(map.get(c)>1){
12                char leftChar=s.charAt(left);
13                map.put(leftChar,map.get(leftChar)-1);
14                left++;
15            }
16            maxLen=Math.max(maxLen,right-left);
17       }
18       
19       return maxLen;
20       
21    }
22}