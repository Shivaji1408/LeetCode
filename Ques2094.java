public class Ques2094 {
    public static int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) count[d]++;

        List<Integer> result = new ArrayList<>();
        for (int i = 100; i <= 999; i += 2) {
            int h = i / 100;
            int t = (i % 100) / 10;
            int o = i % 10;
            count[h]--; count[t]--; count[o]--;
            if (count[h] >= 0 && count[t] >= 0 && count[o] >= 0) {
                result.add(i);
            }
            count[h]++; count[t]++; count[o]++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void man(String args[]){
        int[] digits = {};
        
    } 
}