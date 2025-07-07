import java.util.Arrays;

public class Ques2974 {
    public static  int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int[] arr = new int[nums.length];
        while(i < nums.length){
            int alice = nums[i];
            int bob = nums[i+1];
            arr[i] = bob;
            arr[i+1] = alice;
            i = i+2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {6,8,7,4,2,5};
        for(int i=0; i<numberGame(nums).length; i++){
            System.out.print(numberGame(nums)[i] + " ");
        }
    }
}