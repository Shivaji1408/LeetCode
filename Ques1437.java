public class Ques1437 {
    public static boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        int lastdigit = -(k+1);

        for(int i=0; i<len; i++){
            if(nums[i] == 1){
                if(i - lastdigit - 1 < k){
                    return false;
                }
                lastdigit = i;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        System.out.println(kLengthApart(nums, k));
    }
}