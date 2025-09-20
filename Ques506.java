import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Ques506{
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        Integer[] scoreCopy = new Integer[n];
        for (int i = 0; i < n; i++) scoreCopy[i] = score[i];

        Arrays.sort(scoreCopy, Collections.reverseOrder());

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) rankMap.put(scoreCopy[i], "Gold Medal");
            else if (i == 1) rankMap.put(scoreCopy[i], "Silver Medal");
            else if (i == 2) rankMap.put(scoreCopy[i], "Bronze Medal");
            else rankMap.put(scoreCopy[i], String.valueOf(i + 1));
        }

        for (int i = 0; i < n; i++) {
            res[i] = rankMap.get(score[i]);
        }

        return res;
    }

    public static void main(String args[]){
        int[] score = {10,3,8,9,4};
        String[] res = findRelativeRanks(score);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        
    }
}