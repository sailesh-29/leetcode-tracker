// Last updated: 8/7/2026, 11:02:59 PM
1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        map.put('I',1);
5        map.put('V',5);
6        map.put('X',10);
7        map.put('L',50);
8        map.put('C',100);
9        map.put('D',500);
10        map.put('M',1000);
11        int sum=0;
12        for(int i=0;i<s.length();i++){
13            int current = map.get(s.charAt(i));
14            if(i<s.length()-1 && current<map.get(s.charAt(i+1))){
15                sum-=current;
16            }else{
17                sum+=current;
18            }
19        }
20        return sum;
21    }
22}