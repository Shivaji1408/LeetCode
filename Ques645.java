public class Ques645 {
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for(int i=1; i<=nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i){
                    count++;
                }
            }
            if(count == 2){
                res[0] = i;
            }else if(count == 0){
                res[1] = i;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[] nums = {1,2,2,4};
        System.out.print(findErrorNums(nums)[0] + " ");
        System.out.print(findErrorNums(nums)[1]);
    }
}