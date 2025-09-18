public class Ques1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int[] res = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            count[arr1[i]]++;
        }
        int a = 0;
        for(int i=0; i<arr2.length; i++){
            while(count[arr2[i]] > 0){
                res[a] = arr2[i];
                a++;
                count[arr2[i]]--;
            }
        }

        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                res[a] = i;
                a++;
                count[i]--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
	    int[] arr2 = {2,42,38,0,43,21};
        int[] result = relativeSortArray(arr1, arr2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
