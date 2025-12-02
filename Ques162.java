public class Ques162{
    public static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(max == nums[i]){
                max = i;
                break;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] nums = {1,2,1};
        System.out.println(findPeakElement(nums));
    }
}