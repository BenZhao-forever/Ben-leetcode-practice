public class leetcode1189 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/maximum-number-of-balloons/", 1189);
    }
    public static int maxNumberOfBalloons(String text) {
        int[] map = new int[5];
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)){
                case 'b' :
                    map[0]++;
                    break;
                case 'a' :
                    map[1]++;
                    break;
                case 'l' :
                    map[2]++;
                    break;
                case 'o' :
                    map[3]++;
                    break;
                case 'n' :
                    map[4]++;
                    break;
            }
        }
        int answer = map[0];
        for (int i = 1; i < 4; i++) {
            if (i == 2 || i == 3) {
                map[i] /= 2;
            }
            answer = Math.min(answer, map[i]);
        }
        return answer;
    }
}
