import java.util.Arrays;

public class Ques1913 {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len-1]*nums[len-2] - nums[0]*nums[1];
    }
    public static void main(String[] args) {
        int nums[] = {4,2,5,6,3,8};
        System.out.println(maxProductDifference(nums));
    }
}