import java.util.Arrays;
public class Ques1460 {
    // My Simple Approach

    // public boolean canBeEqual(int[] target, int[] arr) {
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // for(int i=target.length-1; i>=0; i--){
        //     if(target[i] != arr[i]){
        //         return false;
        //     }
        // }
        // return true;
        
    // Optimized Code from other person
    static {
        for(int i = 0; i < 500; i++) canBeEqual(new int[] {1, 2}, new int[] {1});
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        int[] freq = new int[1001];
        for(int i = 0; i < arr.length; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for(int i = 0; i < 1001; i++) if(freq[i] != 0) return false;
        return true;
    }

    public static void main(String args[]){
        int[] target = {1,2,3,4};
        int[] arr = {3,4,1,2};
        System.out.println(canBeEqual(target, arr));
    }
}