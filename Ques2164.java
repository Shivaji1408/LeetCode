import java.util.Arrays;
import java.util.Collections;
public class Ques2164 {
    public static int[] sortEvenOdd(int[] nums) {
        int len = (int)(nums.length/2);
        int[] even;
        if(nums.length % 2 == 0){
            even = new int[len];
        }else{
            even = new int[len+1];
        }
        Integer odd[] = new Integer[len];
        int e = 0;
        int o = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even[e] = nums[i];
                e++;
            }else{
                odd[o] = nums[i];
                o++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());
        int e1 = 0;
        int o1 = 0;
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                res[i] = even[e1];
                e1++;
            }else{
                res[i] = odd[o1];
                o1++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        // int nums[] = {4,1,2,3}; 
        int nums[] = {3,9,4,1,2}; 
        // int nums[] = {4,1,2,3}; 
        for(int i=0; i<sortEvenOdd(nums).length; i++){
            System.out.print(sortEvenOdd(nums)[i] + " ");
        }
    }
}