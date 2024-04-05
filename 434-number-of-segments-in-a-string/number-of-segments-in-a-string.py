class Solution:
    def countSegments(self, s: str) -> int:
        if len(s) == 0:
            return 0

        words = s.split()
        return len(words)