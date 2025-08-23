public class Ques806 {
    public static int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        int x = 1;
        int sum = 0;

        for(char ch : s.toCharArray()){
            int char_width = widths[ch-'a'];
            if(sum+char_width>100){
                x++;
                sum = char_width;
            }
            else sum += char_width;

        }
        arr[0] = x;
        arr[1] = sum;
        return arr;
    }

    public static void main(String[] args){
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<numberOfLines(widths, s).length; i++){
            System.out.print(numberOfLines(widths, s)[i] + " ");
        }
    }
}