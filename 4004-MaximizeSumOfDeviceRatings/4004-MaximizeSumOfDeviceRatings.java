// Last updated: 7/9/2026, 10:06:19 AM
class Solution {
    public long maxRatings(int[][] units) {
        int n=units[0].length;
        if(n==1){
            int sum = 0;
            for(int[] row:units){
                sum+=row[0];
            }
            return sum;
        }
        long sumSecond=0;
        int globalMin = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for(int[] row:units){
            Arrays.sort(row);
            globalMin=Math.min(globalMin,row[0]);
            int secondMin = row[1];
            sumSecond += secondMin;
            minSecond = Math.min(minSecond,secondMin);
        }
        return sumSecond-minSecond+globalMin;
    }
}