// Last updated: 7/9/2026, 10:06:11 AM
class Solution {
    public int maxDistance(String moves) {
        int dx=0;
        int dy=0;
        int k=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
                case 'U':
                    dy++;
                    break;
                case 'D':
                    dy--;
                    break;
                case 'L':
                    dx--;
                    break;
                case 'R':
                    dx++;
                    break;
                case '_':
                    k++;
                    break;
            }
        }
        return Math.abs(dx)+Math.abs(dy)+k;
    }
}