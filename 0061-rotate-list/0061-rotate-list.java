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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode last = head;
        int n = 1;
        if(head == null){
            return head;
        }
        while(last != null){
            
            if(last.next == null){
                
                break;
            }
            n++;
            last = last.next;
        }
        k = k%n;
        if(k == 0){
            return head;
        }
        ListNode t = head;
        ListNode res = null;
        int count = 1;
        while(t != null){
            if(count == n-k){
                break;
            }
            count++;
            t = t.next;
        }
        last.next = head;
        res = t.next;
        t.next = null;

        return res;
    }
    
}