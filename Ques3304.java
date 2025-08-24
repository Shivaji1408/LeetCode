public class Ques3304{
    public static char kthCharacter(int k) {
        StringBuilder generated = new StringBuilder();
        generated.append("a");
        while(generated.length()<k){
            StringBuilder wrd = new StringBuilder();
            String temp = generated.toString();
            for (char ch : temp.toCharArray()) {
                wrd.append((char)(ch + 1));
            }
            generated.append(wrd);
        }
        return generated.charAt(k-1);
    }
    public static void main(String args[]){
        int k=5;
        System.out.println(kthCharacter(k));
    }
}