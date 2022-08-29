class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        temp = {}
        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for index in range(0, len(pattern)):
            if pattern[index] in temp.keys():
                if temp[pattern[index]] != words[index]:
                    return False
            elif words[index] not in temp.values():
                temp[pattern[index]] = words[index]
            else:
                return False
        return True
            
            