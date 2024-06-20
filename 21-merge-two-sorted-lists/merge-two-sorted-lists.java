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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        
        if(list1 == null && list2 == null)
            return list1;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode temp = new ListNode(list1.val);
                head.next = temp;
                list1 = list1.next;
            }
            else{
                ListNode temp = new ListNode(list2.val);
                head.next = temp;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1 == null){
            head.next = list2; 
        }
        if(list2 == null){
            head.next = list1;
        }
        
        
        return ans.next;
    }
}