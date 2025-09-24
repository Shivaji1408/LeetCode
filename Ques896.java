public class Ques896 {
    public static boolean isMonotonic(int[] nums) {
        if(nums[0] < nums[nums.length-1]){
            return ascending(nums);
        }
        if(nums[0] > nums[nums.length-1]){
            return decending(nums);
        }
        if(nums[0] == nums[nums.length-1]){
            return equal(nums);
        }
        return false;
        
    }
    private boolean ascending(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    private boolean decending(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
        }
        return true;
    }
    private boolean equal(int[] nums){
        boolean res = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                res = false;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {1,2,2,3};
        Syetem.out.println(isMonotonic(nums));
    }
}