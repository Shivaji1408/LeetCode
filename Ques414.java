import java.util.*;

public class Ques414 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        long max_num = (long)nums[nums.length - 1] + 1;
        int count = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < max_num) {
                max_num = nums[i];
                count++;
            }
            if (count == 3) return nums[i];
        }
        return nums[nums.length - 1];
    }

    public static void main(String args[]){
        // int nums[] = {1,2147483647,-2147483648};
        int nums[] = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }
}