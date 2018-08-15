// Middle of LinkedList

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MidLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        if(node1 == null && node2 == null){
            return null;
        }
        while(node2.next != null && node2.next.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        if(node2.next == null){
            return node1;
        }
        return node1.next;
    }
}