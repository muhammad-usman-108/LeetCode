# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        start = list1
        index = 0
        start_add = 0
        end_add = 0
        while start != None:
            if index == a-1:
                start_add = start
            elif index == b:
                end_add = start
                break
            start = start.next
            index = index + 1
        start_add.next = list2
        while list2.next != None:
            list2 = list2.next
        list2.next = end_add.next

        return list1

        

