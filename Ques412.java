import java.util.ArrayList;
import java.util.List;
public class Ques412 {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
            }else if(i % 3 == 0){
                res.add("Fizz");
            }else if(i % 5 == 0){
                res.add("Buzz");
            }else{
                res.add(""+i);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int n=15;
        for(int i=0; i<fizzBuzz(n).size(); i++){
            System.out.print(fizzBuzz(n).get(i) + " ");
        }
    }
}