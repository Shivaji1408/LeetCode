import java.util.Arrays;

public class Ques1619{
    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = (arr.length * 5)/100;
        int count = 0;
        int sum = 0;
        for(int i=n; i<arr.length-n; i++){
            sum = sum + arr[i];
            count++;
        }
        return (double)sum/count;
    }
    public static void main(String args[]){
        int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        System.out.println(trimMean(arr));
    }
}
