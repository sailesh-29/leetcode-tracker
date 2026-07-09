// Last updated: 7/9/2026, 10:06:56 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums==null){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key : map.keySet() ){
            pq.add(key);
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }
        return result;
    }
}