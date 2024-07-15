# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res_h = res = ListNode()
        sum = 0
        while (head != None):
            if head.val == 0 and sum > 0:
                res.val = sum
                if (head.next != None):
                    res.next = ListNode()
                else:
                    res.next = None
                res = res.next
                sum = 0
            else:
                sum = sum + head.val
            head = head.next
        return res_h