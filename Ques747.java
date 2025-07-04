import java.util.Arrays;

public class Ques747 {
    public static int dominantIndex(int[] nums) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        Arrays.sort(temp);
        int max = temp[nums.length-1];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == max){
                idx = i;
            }
        }
        if(2*temp[nums.length-2] <= max){
            return idx;
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
}
