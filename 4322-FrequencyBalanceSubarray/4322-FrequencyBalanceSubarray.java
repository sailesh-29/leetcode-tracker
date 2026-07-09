// Last updated: 7/9/2026, 10:06:07 AM
class Solution {
    public int getLength(int[] nums) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> freq = new HashMap<>();
            HashMap<Integer,Integer> freqCount = new HashMap<>();
            for(int j=i;j<n;j++){
                int x = nums[j];
                int oldFreq = freq.getOrDefault(x,0);
                if(oldFreq>0){
                freqCount.put(oldFreq,freqCount.get(oldFreq)-1);
                    if(freqCount.get(oldFreq)==0){
                        freqCount.remove(oldFreq);
                    } 
                }
                int newFreq = oldFreq+1;
                freq.put(x,newFreq);
                freqCount.put(newFreq,freqCount.getOrDefault(newFreq,0)+1);
                if(valid(freqCount)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private boolean valid(HashMap<Integer,Integer> fc){
        if(fc.size()==1){
            int freq=fc.keySet().iterator().next();
            int count = fc.get(freq);
            return count==1;
        }
        if(fc.size()!=2){
            return false;
        }
        Iterator<Integer> it = fc.keySet().iterator();
        int a=it.next();
        int b = it.next();
        int small = Math.min(a,b);
        int large = Math.max(a,b);
        return large == 2*small;
    }
}