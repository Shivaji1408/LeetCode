import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ques1331 {
    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }
        return arr;
    }

    public static void main(String args[]){
        int[] arr = {40,10,20,30};
        for(int i=0; i<arrayRankTransform(arr).length; i++){
            System.out.print(arrayRankTransform(arr)[i] + " ");
        }
    }
}