// Last updated: 7/9/2026, 10:07:03 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char d:t.toCharArray()){
            count[d-'a']--;
        }
        for(int n:count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}