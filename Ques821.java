public class Ques821 {
    public static int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()],pos=-s.length();
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)==c)pos=i;
            arr[i]=Math.abs(i-pos);
        }
        for(int i=pos-1;i>=0;i--){
            if(s.charAt(i)==c)pos=i;
            arr[i]=Math.min(arr[i],pos-i);
        }
        return arr;
    }
    public static void main(String args[]){
        String s = "loveleetcode";
        char c = 'e';
        for(int i=0; i<shortestToChar(s,c).length; i++){
            System.out.print(shortestToChar(s,c)[i] + " ");
        }
    } 
}