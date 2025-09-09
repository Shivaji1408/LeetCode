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
public class Ques234 {
    public static boolean isPalindrome(ListNode head) {
        int temp = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode newNode = head;
        while(newNode != null){
            temp = newNode.val;
            newNode = newNode.next;
            lst.add(temp);
        }
        for(int i=0; i<lst.size()/2; i++){
            if(lst.get(i) != lst.get(lst.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}