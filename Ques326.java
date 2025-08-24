public class Ques326 {
    public static boolean isPowerOfThree(int n) {
        // Recursive Method
        
        // if(n<=0){
        //     return false;
        // }
        // if(n==1){
        //     return true;
        // }
        // if(n%3 != 0){
        //     return false;
        // }
        // return isPowerOfThree(n/3);

        // Direct Solution
        int maxPowerOf3 = 1162261467; // 3^19 is the largest power of 3 in int range
        return n > 0 && maxPowerOf3 % n == 0;
    }

    public static void main(String args[]){
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
}
