public class Ques376 {
    public static int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n;
        int up = 1, down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
    public static void main(String args[]){
        int[] nums = {1,7,4,9,2,5};
        System.out.println(wiggleMaxLength(nums));
    }
}
