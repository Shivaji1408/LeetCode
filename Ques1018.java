import java.util.List;
import java.util.ArrayList;
public class Ques1018 {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lst = new ArrayList<>();
        List<Boolean> ans = new ArrayList<>();
        int val = 0;
        for(int ele : nums){
            val = ((val*2)+ele)%5;
            ans.add(val==0);
        }
        return  ans;
    }

    public static void main(String args[]){
        int[] nums = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        List<Boolean> lst = prefixesDivBy5(nums);
        for(int i=0; i<lst.size(); i++){
            System.out.print(lst.get(i) + ", ");
        }
    }
}