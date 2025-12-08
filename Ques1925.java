public class Ques1925 {
    public static int countTriples(int n) {
        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                int sumSquares = a * a + b * b;
                int c = (int) Math.sqrt(sumSquares);
                if (c * c == sumSquares && c <= n) {
                    cnt += 2;
                }
            }
        }
        return cnt;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(countTriples(n));
    }
}