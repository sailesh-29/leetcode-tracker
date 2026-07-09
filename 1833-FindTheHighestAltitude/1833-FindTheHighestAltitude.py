# Last updated: 7/9/2026, 10:06:31 AM
class Solution(object):
    def largestAltitude(self, gain):
        cur,max_altitude=0,0
        for i in gain:
            cur+=i
            if cur>max_altitude:
                max_altitude=cur
        return max_altitude 

        
        
        