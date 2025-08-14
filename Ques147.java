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
public class Ques14 {
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode curr = head;
        while(curr != null){
            ListNode prev = temp;
            ListNode next = curr.next;
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return temp.next;
    }
}