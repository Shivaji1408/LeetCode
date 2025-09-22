public class Ques3005 {
    public static int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int count = Integer.MIN_VALUE;
        for(int i=0; i<freq.length; i++){
            if(count < freq[i]){
                count = freq[i];
            }
        }
        int res = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] == count){
                res += count;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        System.out.print(maxFrequencyElements(nums));
    }
}