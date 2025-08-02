public class Ques908 {
    public static int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int n:nums){
            if(n<min) min=n;
            if(n>max) max=n;
        }
        return Math.max(0,max-min-2*k);
    }

    public static void main(String ags[]){
        int[] nums = {0,10};
        int k = 2;
        System.out.print(smallestRangeI(nums,k));
    }
}