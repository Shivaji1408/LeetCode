public class Ques81 {
    public static boolean search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {3,4,5,1,2};
        int target = 3;
        System.out.println(search(nums,target));
    }
}