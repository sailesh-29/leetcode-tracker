// Last updated: 7/9/2026, 10:06:09 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int SquareSum=0;
        while(n>0){
            int digit=n%10;
            digitSum+=digit;
            SquareSum+=digit*digit;
            n=n/10;
        }
        return SquareSum-digitSum>=50;
    }
}