import java.util.ArrayList;

public class Ques191{

    //  My Approach for this question

    public static int hammingWeight(int n) {
        ArrayList<Integer> lst = binary(n);
        int count = 0;
        for(int i=0; i<lst.size(); i++){
            if(lst.get(i) == 1){
                count++;
            }
        }
        return count;
    }
    public static ArrayList<Integer> binary(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        while(n > 0){
            int temp = n%2;
            n = n/2;
            lst.add(temp);
        }
        return lst;
    }

    // Optimized Solution for this question

    // public static int hammingWeight(int n) {
    //     int setBits = Integer.bitCount(n);
    //     return setBits;
    // }

    public static void main(String args[]){
        int n = 128;
        System.out.println(hammingWeight(n));
    }
}