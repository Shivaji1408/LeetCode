import java.util.Arrays;

public class Ques977 {
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String args[]){
        int[] nums = {-4,-1,0,3,10};
        for(int i=0; i<sortedSquares(nums).length; i++){
            System.out.print(sortedSquares(nums)[i] + " ");
        }
    }
}