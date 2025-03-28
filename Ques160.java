import java.lang.classfile.components.ClassPrinter.ListNode;

public class Ques160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            a= a==null ? headB:a.next;
            b= b==null ? headA:b.next;
        }
        return a;

    }
    public static void main(String args[]){
        int headA = 12;
        int headB = 13;
        getIntersectionNode(headA,headB);
    }
}
