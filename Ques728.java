import java.util.ArrayList;
import java.util.List;
public class Ques728 {
    public static boolean checkDivisibility(int num){
        int n = num;
        while(n>0){
            int rem = n % 10;
            if(rem == 0){
                return false;
            }
            if(num%rem != 0){
                return false;
            }
            n = n/10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(checkDivisibility(i)){
                lst.add(i);
            }
        }
        return lst;
    }

    public static void main(String args[]){
        int left = 1;
        int right = 22;
        List<Integer> lst = selfDividingNumbers(left,right);
        for(int i=0; i<lst.size(); i++){
            System.out.print(lst.get(i) + " ");
        }
    }
}
