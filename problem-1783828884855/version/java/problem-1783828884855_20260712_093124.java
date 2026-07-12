// Last updated: 7/12/2026, 9:31:24 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        int start = toSeconds(startTime);
4        int end= toSeconds(endTime);
5        return end-start;
6    }
7    private int toSeconds(String time){
8        String[] t =time.split(":");
9        int hours=Integer.parseInt(t[0]);
10        int minutes=Integer.parseInt(t[1]);
11        int seconds=Integer.parseInt(t[2]);
12        return hours*3600+minutes*60+seconds;
13    }
14}