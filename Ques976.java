import java.util.Arrays;
public class Ques976 {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=len-1; i>=2; i--){
            if((nums[i-2] + nums[i-1]) > nums[i]){
                return nums[i-2] + nums[i-1] + nums[i];
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int[] nums = {2,3,4,4};
        System.out.println(largestPerimeter(nums));
    }
}
