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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        

        head = head.next;
        while(current != null && current.next != null){
            ListNode temp = current.next;
            ListNode nextPair = temp.next;


            temp.next = current;
            current.next = nextPair;

            if(prev != null){
                prev.next  = temp;
            }

            prev = current;

            current = current.next;

        }
        return head;
    }
}