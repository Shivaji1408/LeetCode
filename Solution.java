public class Solution {
    
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
        System.out.println("H?gelo ");
        System.out.println("H?gelo ");
    }
}