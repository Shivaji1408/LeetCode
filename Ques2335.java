public class Ques2335 {
    public static int fillCups(int[] amount) {
        int mx = 0, sum = 0;
        for(int a: amount) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
    public static void main(String args[]){
        int[] amount = {1,4,2};
        System.out.println(fillCups(amount));
    }
}