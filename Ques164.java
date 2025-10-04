import java.util.Arrays;
public class Ques164 {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2){
            return 0;
        }
        int res = 0;
        for(int i=0; i<nums.length-1; i++){
            if(res < nums[i+1] - nums[i]){
                res = nums[i+1] - nums[i];
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}