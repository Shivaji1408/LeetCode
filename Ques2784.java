import java.util.Arrays;
public class Ques2784 {
    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2){
            return false;
        }
        if(nums[nums.length-1] > nums.length-1){
            return false;
        }
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] != nums[i+1]){
                continue;
            }else{
                return false;
            }
        }
        if(nums[nums.length-1] == nums[nums.length-2]){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {2,1,3};
        System.out.println(isGood(nums));
    }
}