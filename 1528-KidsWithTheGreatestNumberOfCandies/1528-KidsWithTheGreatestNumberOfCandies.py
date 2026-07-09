# Last updated: 7/9/2026, 10:06:34 AM
class Solution(object):
        def kidsWithCandies(self, candies, extraCandies):
            max_candies = max(candies)
            return [c + extraCandies >= max_candies for c in candies]


        
        