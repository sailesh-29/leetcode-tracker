// Last updated: 7/9/2026, 10:07:06 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftproduct = 1;
        int rightproduct = 1;
        for(int i=0; i<nums.length; i++){
            result[i]=leftproduct;
            leftproduct=leftproduct*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*rightproduct;
            rightproduct=rightproduct*nums[i];
        }
        return result;      
    }
    
}