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
        if(head == null){
            return null;
        }
        ListNode left = head;
        ListNode right = left.next;

        ListNode prev = null;
        ListNode res = null;

        if(left.next == null){
            return left;
        }

        while(left != null && right != null){

            
            ListNode nextpair = right.next;
            
            if(prev != null){
                prev.next = right;
            }

            prev = left;
            right.next = left;

            if(res == null){
                res = right;
            }

            left.next = nextpair;
            left = nextpair;
            if(left != null){
                right = left.next;
            }


        }
        return res;
        
    }
}