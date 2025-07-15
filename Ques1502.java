import java.util.Arrays;
public class Ques1502 {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int distance = arr[1] - arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] + distance != arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] nums = {1,9,3,7,5,13};
        System.out.println(canMakeArithmeticProgression(nums));
    }
}