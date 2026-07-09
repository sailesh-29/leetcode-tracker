# Last updated: 7/9/2026, 10:06:46 AM
class Solution(object):
    def findMaxAverage(self, nums, k):
        cur = sum(nums[:k])
        max_sum = cur
        for i in range(k, len(nums)):
            cur += nums[i] - nums[i - k]
            max_sum = max(max_sum,cur)
        return max_sum /float(k) 


        
        