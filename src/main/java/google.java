/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/9/15
 * Project: Ben-leetcode-practice
 */
public class google {
    public static void main(String[] args) {

    }
    public static int seprate(int N){
        int answer = Integer.MAX_VALUE;
        String number = Integer.toString(N);
        for (int i = 0; i < number.length() - 1; i++) {
            String a = number.substring(0 , i + 1);
            String b = number.substring(i + 1, number.length());
            answer = Math.min(answer, Math.abs(Integer.parseInt(a) - Integer.parseInt(b)));
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

}
