
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Ques19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n==size){
            head = head.next;
            return head;
        }

        int i=1;
        ListNode prev = head;
        while(i < size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}