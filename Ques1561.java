import java.util.Arrays;
public class Ques1561 {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int a = piles.length - 1;
        int b = 0;
        int profit = 0;
        while(b < a){
            a--;
            profit += piles[a];
            a--;
            b++;
        }
        return profit;
    }
    public static void main(String args[]){
        int[] piles = {2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }
}