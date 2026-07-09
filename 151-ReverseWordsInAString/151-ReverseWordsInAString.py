# Last updated: 7/9/2026, 10:07:18 AM
class Solution(object):
    def reverseWords(self, s):
        return ' '.join(s.strip().split()[::-1])
        