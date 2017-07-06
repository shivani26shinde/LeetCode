# Remove duplicates from sorted list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode ref = prev;
        while(prev != null  && curr != null){
            while(curr != null && prev.val == curr.val){
                curr = curr.next;
            }
            prev.next = curr;
            prev = curr;
            if(curr != null){
                curr = curr.next;
            }
        }
        if(prev != null){
            prev.next = curr;
            prev = curr;
        }        
        return ref;
    }
}