/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = size(headA);
        int l2 = size(headB);
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(l1 >= l2){
            int dif = l1-l2;
            while(dif-- != 0){
                temp1 = temp1.next;
            }
        }
        else{
            int dif = l2-l1;
            while(dif-- != 0){
                temp2 = temp2.next;
            }
        }
        
        ListNode ans = null;
        while(temp1 != null){
            if(temp1 == temp2){
                ans = temp1;
                return ans;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return ans;
        
        
    }
}