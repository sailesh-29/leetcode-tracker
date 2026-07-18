// Last updated: 7/18/2026, 7:12:16 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = nums[0];
4        int max = nums[0];
5        for(int num:nums){
6            min=Math.min(min,num);
7            max=Math.max(max,num);
8        }
9        return GCD(min,max);
10    }
11    private int GCD(int a ,int b){
12        while(b!=0){
13            int temp = b;
14            b = a%b;
15            a=temp;
16        }
17        return a;
18    }
19}