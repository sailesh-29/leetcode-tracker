// Last updated: 7/9/2026, 10:07:44 AM

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int width = right - left;
        int area = h * width;
        if (area > maxArea) {
            maxArea = area;
        }

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}
}