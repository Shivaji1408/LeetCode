import java.util.*;
public class Ques2248 {
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> lst = new ArrayList<>();
        int[] count = new int[1001];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                count[nums[i][j]]++;
            }
        }
        for(int i=0; i<count.length; i++){
            if(count[i] == nums.length){
                lst.add(i);
            }
        }
        return lst;
    }
    public static void main(String args[]){
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
}