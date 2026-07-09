// Last updated: 7/9/2026, 10:07:15 AM
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;
        for(int j=1;j<nums.length;j++){
            if(count==0){
                candidate=nums[j];
                count=1;
            }else if(nums[j]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}