public class Ques9 {
    public static boolean isPalindrome(int x) {
        int num = 0;
        int n = x;
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        while(x > 0){
            int temp = x%10;
            num = num*10 + temp;
            x = x/10;
        }
        return (num == n);
    }
    public static void main(String args[]){
        int x = 101;
        System.out.println(isPalindrome(x));
    }
}
