public class Ques260 {
    public static int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = nums[i];
                if (index == 2) {
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] res = singleNumber(nums);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
