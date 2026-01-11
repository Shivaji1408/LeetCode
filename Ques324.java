import java.util.Arrays;

public class Ques324 {
    public static void wiggleSort(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int len = nums.length;
        int mid = (len+1)/2;
        int left = mid - 1;
        int right = len - 1;
        for(int i=0; i<len; i++){
            if(i%2==0){
                nums[i] = temp[left--];
            }else{
                nums[i] = temp[right--];
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {1,5,1,1,6,4};
        wiggleSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
