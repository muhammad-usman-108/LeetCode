/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> address = new HashMap<ListNode, Integer>();
        int pos = 0;
        
        while(head != null) {
            if (address.containsKey(head.next)) {
                return head.next;
            }
            address.put(head, pos);
            head = head.next;
            pos++;
        }
        return null;
    }
}