import java.util.HashSet;
public class Ques575 {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> res = new HashSet<>();
        for(int num : candyType){
            res.add(num);
        }
        return Math.min(res.size(),candyType.length/2);
    }
    public static void main(String args[]){
        int[] candyType = {1,1,2,3};
        System.out.println(distributeCandies(candyType));
    }
}