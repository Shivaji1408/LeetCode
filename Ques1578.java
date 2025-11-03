public class Ques1578 {
    public static int minCost(String colors, int[] neededTime) {
        int time = 0;
        int l = 0;
        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(l) == colors.charAt(i)){
                if(neededTime[l] < neededTime[i]){
                    time += neededTime[l];
                    l = i;
                }else{
                    time += neededTime[i];
                }
            }else{
                l = i;
            }
        }
        return time;
    }

    public static void main(String args[]){
        String colors = "aaabbbabbbb";
        int[] neededTime = {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colors,neededTime));
    }
}