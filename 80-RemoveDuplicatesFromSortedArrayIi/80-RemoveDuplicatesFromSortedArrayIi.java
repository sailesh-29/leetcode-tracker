// Last updated: 7/9/2026, 10:07:28 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int i=2;
        for(int j=2;j<=nums.length-1;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];                    
                i++;
            }
        }
        return i;
    }
}