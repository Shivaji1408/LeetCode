public class Ques2154 {
    public static int findFinalValue(int[] nums, int original) {
        int res = original;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == res){
                res = res * 2;
                i = -1;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[] nums = {8,19,4,2,15,3};
        int original = 2;
        System.out.println(findFinalValue(nums,original));
    }
}