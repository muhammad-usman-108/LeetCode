# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        n = 0
        temp = head
        while temp != None:
            n = n + 1
            temp = temp.next
        # print(n)

        temp = head
        index = 0
        res = {}
        while temp != None:
            if n/2 > index:
                res[index] = temp.val
            else:
                res[n-1-index] = res[n-1-index] + temp.val
            index = index + 1
            temp = temp.next
        # print(n)
        # print(max(res.values()))
        return max(res.values())