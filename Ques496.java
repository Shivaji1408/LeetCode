public class Ques496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int max = -1;
            for(int j = 0; j < nums2.length; j++){
                int index = j;
                if(nums1[i] == nums2[j]){
                    while(index != nums2.length){
                        if(nums2[index] > nums1[i]){
                            max = nums2[index];
                            break;
                        }
                        index++;
                    }
                }
            }
            ans[i] = max;
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = nextGreaterElement(nums1,nums2);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
