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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode leftnode = null;
        ListNode before = null;
        ListNode prev = null;
        int count = 1;
        while(count != left){
            if(count < left){
                before = current;
                current = current.next;
            }
            count++;
        }
        leftnode = current;
        int times = right - left + 1;
        int ord = 1;
        while(ord <= times){
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
            ord++;
        }
        leftnode.next = current;

        if (before != null) {
            before.next = prev;
        } else {
            head = prev;
        }  
        return head;
    }
}