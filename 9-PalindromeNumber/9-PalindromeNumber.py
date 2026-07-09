# Last updated: 7/9/2026, 10:07:46 AM
class Solution(object):
    def isPalindrome(self, x):
        if x<0:
            return False
        else:
            s=str(x)
            return s==s[::-1]



        