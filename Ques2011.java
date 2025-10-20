public class Ques2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int i=0; i<operations.length; i++){
            if("++X".equals(operations[i])){
                res++;
            }else if("X++".equals(operations[i])){
                res++;
            }else if("X--".equals(operations[i])){
                res--;
            }else if("--X".equals(operations[i])){
                res--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        String[] operations = {"++X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}