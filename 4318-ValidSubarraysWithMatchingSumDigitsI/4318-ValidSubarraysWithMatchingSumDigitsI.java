// Last updated: 7/9/2026, 10:06:16 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum%10!=x) continue;
                long first=sum;
                while(first>=10){
                    first/=10;
                }
                if(first==x){
                    ans++;
                }
            }
        }
        return ans;
    }
}