import java.util.*;

public class Ques2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ls.add(i);
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }
}