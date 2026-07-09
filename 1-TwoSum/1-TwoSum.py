# Last updated: 7/9/2026, 10:07:49 AM
class Solution(object):
    def twoSum(self, nums, target):
        lookup={}
        for i,num in enumerate(nums):
            complement=target-num
            if complement in lookup:
                return [lookup[complement],i]
            lookup[num]=i
        return []


        