class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        t = sorted(t)
        s = sorted(s)
        if (len(t) == (len(s) + 1)):
            for i in range(0, len(t)-1):
                if t[i] != s[i]:
                    return t[i]
            return t[len(t)-1]
        else:
            return ""