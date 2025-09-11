public class Ques1984 {
    public static int minimumDifference(int[] nums, int k) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<nums.length-k+1; i++){
            int j = i+k-1;
            int temp = nums[j] - nums[i];
            min = Math.min(temp, min);
        }
        return min;
    }
    public static void main(String args[]){
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums,k));
    }
}