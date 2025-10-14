import java.util.ArrayList;
import java.util.List;
public class Ques3349 {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // int n = nums.size();
        // int inc = 1, prevInc = 0, maxLen = 0;
        // for (int i = 1; i < n; i++) {
        //     if (nums.get(i) > nums.get(i - 1)) inc++;
        //     else {
        //         prevInc = inc;
        //         inc = 1;
        //     }
        //     maxLen = Math.max(maxLen, Math.max(inc >> 1, Math.min(prevInc, inc)));
        //     if (maxLen >= k) return true;
        // }
        // return false;

        int prevLen = 0;
        int start = 0;
        for (int i = 1; i <= nums.size(); i++) {
            if (i == nums.size() || nums.get(i) <= nums.get(i - 1)) {
                int len = i - start;
                if (prevLen >= k && len >= k || len >= 2 * k) {
                    return true;
                }
                prevLen = len;
                start = i;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(5);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(3);
        lst.add(1);
        int k = 3;
        System.out.println(hasIncreasingSubarrays(lst, k));
    }
}