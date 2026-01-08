import java.util.Arrays;
public class Ques2160 {
    public static int minimumSum(int num) {
        int[] nums = new int[4];
        int a = 0;
        while(num > 0){
            int temp = num % 10;
            num = num/10;
            nums[a] = temp;
            a++;
        }
        Arrays.sort(nums);
        int num1 = nums[0] * 10 + nums[2];
        int num2 = nums[1] * 10 + nums[3];
        return num1 + num2;
    }
    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
  }
}