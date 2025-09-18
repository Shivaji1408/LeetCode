import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ques1046 {
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<stones.length; i++){
            lst.add(stones[i]);
        }
        while(lst.size() > 1){
            int last = lst.size();
            Collections.sort(lst);
            if(lst.get(last-1) == lst.get(last-2)){
                if(lst.size()==2 && lst.get(0)==lst.get(1)){
                    return 0;
                }
                lst.remove(last-1);
                lst.remove(last-2);
            }else{ 
                int a = lst.get(last-1);
                int b = lst.get(last-2);
                lst.remove(last-1);
                lst.remove(last-2);
                lst.add(a-b);
            }
        }
        return lst.get(0);
    }

    public static void main(String args[]){
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
