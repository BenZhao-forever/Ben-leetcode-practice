
public class leetcode13 {
    public static void main(String[] args) {

    }
    public static int romanToInt(String s) {
        int[] map = new int[26];
        map['I' - 'A'] = 1;
        map['V' - 'A'] = 5;
        map['X' - 'A'] = 10;
        map['L' - 'A'] = 50;
        map['C' - 'A'] = 100;
        map['D' - 'A'] = 500;
        map['M' - 'A'] = 1000;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i) - 'A'] == 0) {
                throw new IllegalArgumentException("not a valid Roman number");
            }
            if(i < s.length() - 1 && map[s.charAt(i) - 'A'] < map[s.charAt(i + 1) - 'A']) {
                answer += map[s.charAt(i + 1) - 'A'] - map[s.charAt(i) - 'A'];
                i++;
            }else{
                answer += map[s.charAt(i) - 'A'];
            }
        }
        return answer;
    }

}
