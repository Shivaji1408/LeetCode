import java.util.*;

public class Solution {
    public static void main(String args[]){
        int n = 3;
        ArrayList<Integer[]> lst = new ArrayList<>();
        // max(i - loc[i],1) to min(i + loc[i],n)
        int[] loc = {1,1,1};
        for(int i=1; i<n+1; i++){
            int a = Math.max( (i-loc[i-1]) , 1);
            int b = Math.min( (i+loc[i-1]) , n);
            Integer[] arr = {a,b};
            lst.add(arr);
        }
        // ( {1,2}, {1,3}, {2,3} )
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        ArrayList<Integer> len= new ArrayList<>();
        for(int i=0; i<lst.size(); i++){
            len.add(lst.get(i)[1] - lst.get(i)[0]);
            System.out.println(len.get(i)+1);
        }
    }
}