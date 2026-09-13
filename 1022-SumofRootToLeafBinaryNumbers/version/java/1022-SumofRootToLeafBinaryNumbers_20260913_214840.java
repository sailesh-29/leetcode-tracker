// Last updated: 9/13/2026, 9:48:40 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        int maxLen=0;
4        int start=0;
5        int end=0;
6        for(int i=0;i<s.length();i++){
7            int odd=expand(s,i,i);
8            int even=expand(s,i,i+1);
9            int len=Math.max(odd,even);
10            if(len>maxLen){
11                maxLen=len;
12                start=i-(len-1)/2;
13            }
14        }
15        return s.substring(start,start+maxLen);
16    }
17    private int expand(String s,int left,int right){
18        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
19            left--;
20            right++;
21        }
22        return right-left-1;
23    }
24}
25
26