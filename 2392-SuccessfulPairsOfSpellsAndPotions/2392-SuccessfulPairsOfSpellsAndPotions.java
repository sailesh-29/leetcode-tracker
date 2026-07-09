// Last updated: 7/9/2026, 10:06:24 AM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int firstValid=potions.length;
            int left=0;
            int right=potions.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                long product = (long)spells[i]*potions[mid];
                if(product>=success){
                    firstValid=mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=potions.length-firstValid;
            
        }
        return ans;
    }
}