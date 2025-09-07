public class Ques1304 {
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        int sum = 0;
        for(int i=0; i<res.length-1; i++){
            res[i] = i+1;
            sum += i+1;
        }
        res[res.length - 1] = -sum;
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] result = sumZero(n);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}