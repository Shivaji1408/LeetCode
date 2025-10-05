public class Ques507 {
    public static boolean checkPerfectNumber(int num) {
        int res = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                res = res + i;
            }
        }
        return res == num;
    }
    public static void main(String args[]){
        int num = 6;
        System.out.println(checkPerfectNumber(num));
    }
}