import java.util.*;
public class Ques2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        int[] temp = new int[heights.length];
        String[] res = new String[names.length];
        System.arraycopy(heights, 0, temp, 0, heights.length);
        Arrays.sort(temp);
        int a=0;
        for(int i= 0; i<temp.length; i++){
            for(int j=0; j<heights.length; j++){
                if(temp[i] == heights[j]){
                    res[a] = names[j];
                    a++;
                }
            }
        }
        Collections.reverse(Arrays.asList(res));
        return res;
    }

    public static void main(String args[]){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        for(int i=0; i<sortPeople(names,heights).length; i++){
            System.out.print(sortPeople(names,heights)[i] + " ");
        }
    }
}