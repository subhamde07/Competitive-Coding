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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        int carry = 0;
        
//         while(l1 != null || l2 != null){
//             int sum = 0;
//             if(l1 == null){
//                 sum = l2.val + carry;
//                 head.next = new ListNode(sum%10);
//                 carry = sum/10;
//                 l2 = l2.next;
//             }else if(l2 == null){
//                 sum = l1.val + carry;
//                 head.next = new ListNode(sum%10);
//                 carry = sum/10;
//                 l1 = l1.next;
//             }else{
//                 sum = l1.val + l2.val + carry;
//                 head.next = new ListNode(sum%10);
//                 carry = sum/10;
//                 l1 = l1.next;
//                 l2 = l2.next;
//             }
        
//             head = head.next;
//         }
        
        
        while(l1 != null || l2 != null){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            head.next = new ListNode(carry % 10);
            head = head.next;
            carry = carry / 10;
        }
            
        
        if(carry == 1){
            head.next = new ListNode(1);
        }
        
        return ans.next;
        
    }
}