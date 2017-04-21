# Swap Nodes

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } 
        ListNode h = new ListNode(0);
        ListNode p = h;
        h.next = head;
        while(p.next != null && p.next.next != null){
            ListNode p1 = p;
            p = p.next;
            p1.next = p.next;
            ListNode p2 = p.next.next;
            p.next.next = p;
            p.next = p2;
        }
        return h.next;
    }
}