// Last updated: 7/9/2026, 10:06:14 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        int sum=0;
        for(int num:nums){
            int range = digitRange(num);
            maxRange = Math.max(maxRange,range);
        }
        for(int num:nums){
            if(digitRange(num)==maxRange){
                sum+=num;
            }
        }
        return sum;
    }
    private int digitRange(int num){
        int minDigit=9;
        int maxDigit=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            int digit=num%10;
            minDigit=Math.min(minDigit,digit);
            maxDigit=Math.max(maxDigit,digit);
            num/=10;
        }
        return maxDigit-minDigit;
    }
}