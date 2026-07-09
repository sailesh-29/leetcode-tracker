# Last updated: 7/9/2026, 10:06:30 AM
class Solution(object):
    def mergeAlternately(self, word1, word2):
        res = []
        i, j = 0, 0
        len1, len2 = len(word1), len(word2)
        while i < len1 and j < len2:
            res.append(word1[i])
            res.append(word2[j])
            i += 1
            j += 1
        if i < len1:
            res.extend(word1[i:])
        if j < len2:
            res.extend(word2[j:])
        return ''.join(res)
