import java.util.ArrayList;

public class Ques598{
    public static int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;
        for (int[] v : ops) {
            minX = Math.min(minX, v[0]);
            minY = Math.min(minY, v[1]);
        }
        return minX * minY;
    }
    public static void main(String args[]){
        int m = 3;
        int n = 3;
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,ops));
    }
}