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
    int size(ListNode head){
        if(head == null) return -1;
        ListNode temp = head;
        int count = -1;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public ListNode deleteMiddle(ListNode head) {
        
        // Calculate Middle
        int n = size(head);
        int mid;
        if(n == 0){
            head = null;
            return head;
        }
        else if(n%2 == 0)
            mid = n/2;
        else
            mid = n/2+1;
        
        // Remove Middle Node
        ListNode temp = head;
        while(mid-- != 1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}