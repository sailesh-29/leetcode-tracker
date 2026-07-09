# Last updated: 7/9/2026, 10:06:36 AM
class Solution(object):
    def findDifference(self, nums1, nums2):
        nums1,nums2=set(nums1),set(nums2)
        return [list(nums1-nums2),list(nums2-nums1)]

       
        