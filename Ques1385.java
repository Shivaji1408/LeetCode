public class Ques1385 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int Max;
        int count = 0;
        int temp = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                Max = Math.abs(arr1[i] - arr2[j]);
                if(Max <= d){
                    temp++;
                }
            }
            if(temp == 0){
                count++;
            }else{
                temp = 0;
            }
        }
        return count;
    }
    public static void main(String args[]){
        // Test Case - 01
        // int arr1[] = {4,5,8};
        // int arr2[] = {10,9,1,8};
        // int d = 2;
        
        // Test Case - 02
        // int arr1[] = {1,4,2,3};
        // int arr2[] = {-4,-3,6,10,20,30};
        // int d = 3;

        // Test Case - 03
        int arr1[] = {2,1,100,3};
        int arr2[] = {-5,-2,10,-3,7};
        int d = 6;
        
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
} 
