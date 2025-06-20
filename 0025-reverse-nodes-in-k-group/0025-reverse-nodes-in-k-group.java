/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k == 1) return head;

    
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prevGroupEnd = dummy;

    while (true) {
        ListNode kth = getKthNode(prevGroupEnd, k);
        if (kth == null) break;

        ListNode groupStart = prevGroupEnd.next;
        ListNode nextGroupStart = kth.next;

        
        ListNode prev = kth.next;
        ListNode curr = groupStart;
        while (curr != nextGroupStart) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

       
        prevGroupEnd.next = kth;
        prevGroupEnd = groupStart;
    }

    return dummy.next;
}


private ListNode getKthNode(ListNode curr, int k) {
    while (curr != null && k > 0) {
        curr = curr.next;
        k--;
    }
    return curr;
}

        
    }