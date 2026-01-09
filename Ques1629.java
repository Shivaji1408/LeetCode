public class Ques1629 {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] chars = keysPressed.toCharArray();
        int max = releaseTimes[0];
        char rez = chars[0];

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];

            if (duration > max || (duration == max && chars[i] > rez)) {
                max = duration;
                rez = chars[i];
            }
        }

        return rez;
    }

    public static void main(String args[]){
        int[] releaseTimes = {9,29,49,50};
        String keysPressed = "cbcd";
        System.out.println(slowestKey(releaseTimes, keysPressed));
    }
    
}
