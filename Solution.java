public class Solution {
    public static int squareSum(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum += temp*temp;
            n = n/10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int temp = 0;
        if(temp == 1){
            return true;
        }
        temp = squareSum(n);
        while(temp >= 10){
            temp = squareSum(temp);
            if(temp == 1){
                return true;
            }
            isHappy(temp);
        }
        if(temp < 10){
            return false;
        }
        return false;
    } 
    public static void main(String args[]){
        int n = 1000;
        System.out.println(isHappy(n));
    }
}