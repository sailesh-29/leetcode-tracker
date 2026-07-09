# Last updated: 7/9/2026, 10:06:58 AM
class Solution:
    def reverseVowels(self, s):
        vowels = set("aeiouAEIOU")
        s = list(s)
        vowel_chars = [ch for ch in s if ch in vowels][::-1]  # collect & reverse vowels

        vi = 0
        for i in range(len(s)):
            if s[i] in vowels:
                s[i] = vowel_chars[vi]
                vi += 1
        return "".join(s)

        