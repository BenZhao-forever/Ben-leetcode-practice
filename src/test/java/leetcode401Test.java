import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode401Test {

    @org.junit.jupiter.api.Test
    void readBinaryWatch() {
        assertThrows(IllegalArgumentException.class, () -> leetcode401.readBinaryWatch(15));
        assertTrue(leetcode401.readBinaryWatch(9).isEmpty());
        List<String> answer = leetcode401.readBinaryWatch(1);
        List<String> result = Arrays.asList(new String[]{"0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"});
        assertTrue(answer.containsAll(result));
    }
}