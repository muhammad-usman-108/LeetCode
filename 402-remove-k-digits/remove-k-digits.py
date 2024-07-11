class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
    
        for digit in num:
            while k > 0 and stack and stack[-1] > digit:
                stack.pop()
                k -= 1
            stack.append(digit)
        
        # If there are still removals left, remove from the end
        stack = stack[:len(stack) - k]
        
        # Join stack to form the number and strip leading zeros
        result = ''.join(stack).lstrip('0')
        
        # Return '0' if result is empty
        return result if result else '0'