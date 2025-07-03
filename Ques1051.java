import java.util.Arrays;

public class Ques1051 {
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int expected[] = new int[n];
        for(int i=0; i<n; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for(int i=0; i<n; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int heights[] = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}