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
        
        ListNode dummy = new ListNode();
        ListNode ref = dummy;

        while( list1 != null && list2 != null){
            if(list1.val < list2.val){
                ref.next = list1;
                list1 = list1.next;
            }
            else{
                ref.next = list2;
                list2 = list2.next;
            }
            ref = ref.next;
        }
    if(list1!=null){

        ref.next = list1;
    }
    else{
        ref.next = list2;
    }
    return dummy.next;
    }
}