public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Ques92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        for(int i=0; i<left-1; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for(int i=0; i<right-left; i++){
            ListNode tmp = curr.next;
            curr.next = tmp.next;
            tmp.next = prev.next;
            prev.next = tmp;
        }

        return temp.next;
    }
}