public class Ques2598 {
    public static int findSmallestInteger(int[] nums, int value) {
        int[] remainderCount = new int[value];
        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            remainderCount[rem]++;
        }
        int result = 0;
        while (remainderCount[result % value] > 0) {
            remainderCount[result % value]--;
            result++;
        }
        return result;
    }

    public static void main(String args[]){
        int nums[] = {1,-10,7,13,6,8};
        int value = 5;
        System.out.println(findSmallestInteger(nums,value));
    }
}