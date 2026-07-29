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
    public void reverse(ListNode head, int times) {

    ListNode curr = head;
    ListNode prev = null;

    while (times-- > 0) {

        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode left = head;
        ListNode prev = null;
        ListNode right = null;
        ListNode res = null;
        int size = k;
        if(head == null){
            return head;
        }
        while(true){
            right = left;
            for(int i=0;i<k-1;i++){
                if(right == null){
                    break;
                }
                right = right.next;
                
            }

            if(right != null){

                ListNode nextpair = right.next;

                reverse(left,k);

                if(prev != null){
                    prev.next = right;
                }
                prev = left;

                if(res == null){
                    res = right;
                }
                left = nextpair;
            }else{
                if(prev != null){
                    prev.next = left;
                }
                if(res == null){
                    res = left;
                }
                break;

            }
            
        }
        return res;
    }
}