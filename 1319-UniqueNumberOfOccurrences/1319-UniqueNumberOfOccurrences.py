# Last updated: 7/9/2026, 10:06:37 AM
class Solution(object):
    def uniqueOccurrences(self, arr):
        count={}
        for num in arr:
            if num in count:
                count[num]+=1
            else:
                count[num]=1
        frequencies=set()
        for freq in count.values():
            if freq in frequencies:
                return False
            frequencies.add(freq)
        return True

        
        