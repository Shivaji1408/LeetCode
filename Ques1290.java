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
import java.util.ArrayList;
public class Solution {
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
}