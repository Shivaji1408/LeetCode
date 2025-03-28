public class Ques160 {

    // Make ListNode static to be used in the static method
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String args[]) {
        // Create example linked lists
        ListNode headA = new ListNode(12);
        ListNode headB = new ListNode(13);

        // Call the method correctly
        ListNode intersection = getIntersectionNode(headA, headB);

        // Print the result
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
