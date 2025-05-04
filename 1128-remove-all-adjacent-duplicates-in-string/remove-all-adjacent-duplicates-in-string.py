class Solution(object):
    def removeDuplicates(self, s):
        stack = []
        for ch in s:
            if not stack:
                stack.append(ch)
                continue
            
            if ch == stack[-1]:
                stack.pop()
            else:
                stack.append(ch)
        
        return ''.join(stack)
        