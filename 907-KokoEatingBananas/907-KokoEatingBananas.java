// Last updated: 7/9/2026, 10:06:40 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        left=(int)((right-1)/h)+1;
        while(left<=right){
            int mid=left+(right-left)/2;
            long hours=0;
            for(int pile:piles){
                hours+=(pile+mid-1)/mid;
            }
            if(hours<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;

    }
}