import java.util.Arrays;
public class Ques2144 {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int profit = 0;
        int count = 0;
        for(int i=cost.length-1; i>=0; i--){
            if (count < 2){
                profit += cost[i];
                count++;
            }else{
                count = 0;
            }
        }
        return profit;
    }

    public static void main(String args[]){
        int[] cost = {1,2,3};
        System.out.println(minimumCost(cost));
    }
}