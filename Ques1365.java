public class Ques1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            temp[i] = count;
            count = 0;
        }
        return temp;
    }
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        for (int i = 0; i < smallerNumbersThanCurrent(nums).length; i++) {
            System.out.print(smallerNumbersThanCurrent(nums)[i] + " ");
        }
    }
}