# Last updated: 7/9/2026, 10:06:53 AM
class Solution(object):
    def isSubsequence(self, s, t):
        sub_idx = 0
        for i in t:
            if sub_idx == len(s):
                return True
            if i == s[sub_idx]:
                sub_idx += 1
        return sub_idx == len(s)
      
        