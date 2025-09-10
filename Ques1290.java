// Given head which is a reference node to a singly-linked list. 
// The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
// Return the decimal value of the number in the linked list.
// The most significant bit is at the head of the linked list.

// Example 1:
// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10

// Example 2:
// Input: head = [0]
// Output: 0

// Constraints:
// The Linked List is not empty.
// Number of nodes will not exceed 30.
// Each node's value is either 0 or 1.

import java.util.ArrayList;

public class Ques1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int getDecimalValue(ListNode head) {
        ArrayList<Integer> lst = new ArrayList<>();
        while(head != null){
            int temp = head.val;
            lst.add(temp);
            head = head.next;
        }
        int res = 0;
        int a = 0;
        for(int i=lst.size()-1; i>=0; i--){
            res = res + (int)(lst.get(i)* Math.pow(2,a));
            a++;
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode head = new Ques1290().new ListNode(1);
        head.next = new Ques1290().new ListNode(0);
        head.next.next = new Ques1290().new ListNode(1);
        int result = getDecimalValue(head);
        System.out.println(result);
    }
}