import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    void next() {
        MovingAverage ma = new MovingAverage(3);
        assertEquals(1.0, ma.next(1));
        assertEquals(5.5, ma.next(10));
        ma.next(3);
        assertEquals(6.0, ma.next(5));
    }
}