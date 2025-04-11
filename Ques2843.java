public class Ques2843 {
    public static int countSymmetricIntegers(int low, int high) {
        int h = high - low;
        int[] arr = new int[h+1];
        int j=0;
        for(int i=low; i<=high; i++){
            arr[j] = i;
            j++;
        }

        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            String st = Integer.toString(arr[i]);
            int len = st.length();

            if(len % 2 == 0){
                int sum1 = 0;
                int sum2 = 0;
                int n = len / 2;

                for(int a=0; a<n; a++){
                    int num1 = Character.getNumericValue(st.charAt(a));
                    sum1 += num1;
                }
                for(int a=n; a<len; a++){
                    int num2 = Character.getNumericValue(st.charAt(a));
                    sum2 += num2;
                }

                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int low = 1;
        int high = 100;
        System.out.println(countSymmetricIntegers(low,high));
    }
}
