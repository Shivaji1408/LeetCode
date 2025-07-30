import java.util.*;

public class Ques1005 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        int i =0;
        Arrays.sort(nums);
        while(i < k){
            if(nums[i] == 0){
                k--;
            }
            if(nums[i] < 0){
                nums[i] = -nums[i];
                i++;
            }
            if(nums[i] > 0){
                nums[i] = -nums[i];
                i++;
            }
        }
        for(int a=0; a<nums.length; a++){
            sum += nums[a];
        }
        return sum;
    }

    public static void main(String args[]){
        int[] nums = {4,2,3};
        int k = 1;
        System.out.println(largestSumAfterKNegations(nums,k));
    }
}