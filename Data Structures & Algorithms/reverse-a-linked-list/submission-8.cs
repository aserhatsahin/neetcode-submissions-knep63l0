public class Solution {
    public ListNode ReverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {

            next = curr.next;   // sıradaki node’u kaydet
            curr.next = prev;   // yönü ters çevir
            prev = curr;        // prev’i ilerlet
            curr = next;        // curr’i ilerlet
        }

        return prev;
    }
}