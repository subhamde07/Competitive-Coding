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
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int loc = size(head) - n;
        ListNode temp = head;
        if(loc == 0){
            head = head.next;
            return head;
        }
        else{
            while(loc-- != 1){
                temp = temp.next;
            }
        }
        temp.next = temp.next.next;
        return head;
    }
}