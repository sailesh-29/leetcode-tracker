// Last updated: 7/9/2026, 10:06:13 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int curr=mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            long x = nums[i];
            ans+=Math.max(x,x*(long)curr);
            curr--;
        }
        return ans;
    }
}