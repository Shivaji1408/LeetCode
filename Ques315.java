import java.util.*;
public class Ques315 {
    public List<Integer> countSmaller(int[] nums) {
        // ArrayList<Integer> res = new ArrayList<>();
        // if(nums.length < 2){
        //     res.add(0);
        //     return res;
        // }
        // for(int i=0; i<nums.length-1; i++){
        //     int temp = 0;
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] > nums[j]){
        //             temp++;
        //         }
        //     }
        //     res.add(temp);
        // }
        // res.add(0);
        // return res;

        List<Integer> li = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--){
            int ind = insert(sorted,nums[i]);
            li.add(ind);
            sorted.add(ind, nums[i]);
        }

        Collections.reverse(li);
        return li;
    }
    private int insert(List<Integer> arr, int num){
        int l =0;
        int r = arr.size()-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr.get(mid)< num){
                l = mid+1;
            }else r = mid-1;
        }

        return l;
    }
    public static void main(String args[]){
        int[] nums = {};
        System.out.println(nums.length);
    }
}
