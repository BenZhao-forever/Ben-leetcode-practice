

import java.util.ArrayList;
import java.util.List;

public class leetcode401 {
    public static void main(String[] args) {

    }
    public static List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn >10 || turnedOn < 0) {
            throw new IllegalArgumentException("please enter a valid number");
        }
        List<String> answer = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                String string = Integer.toBinaryString(i) + Integer.toBinaryString(j);
                if (turnedOn == countOne(string)) {
                    answer.add(toString(i,j));
                }
            }
        }
        return answer;
    }

    private static int countOne(@org.jetbrains.annotations.NotNull String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    public static String toString(int hour, int minutes) {
        StringBuffer stringbuffer = new StringBuffer("");
        stringbuffer.insert(0,hour);
        stringbuffer.append(":");
        if(minutes < 10) {
            stringbuffer.append(0);
        }
        stringbuffer.append(minutes);
        return stringbuffer.toString();
    }
}
