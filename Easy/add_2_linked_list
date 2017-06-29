# Add two linked lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode point = new ListNode(0);
        ListNode start = point;
        while(l1!=null || l2!=null){
            int value = carry;
            if(l1 != null){
                value = value+l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                value = value+l2.val;
                l2 = l2.next;
            }
            if(value > 9){
                start.next = new ListNode(value%10);
                carry = 1;
            }
            else{
                start.next = new ListNode(value); 
                carry = 0;
            }
            start = start.next;
        }
        if(carry != 0){
            start.next = new ListNode(1); 
        }
        return point.next;
    }
}
