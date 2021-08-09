import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack ms = new MyStack();
    @Test
    void push() {
        ms.push(1);
        ms.push(2);
        assertEquals(2, ms.top());
        assertEquals(2, ms.pop());
        assertFalse(ms.empty());
    }
    @Test
    void pop() {
    }

    @Test
    void top() {
    }

    @Test
    void empty() {
    }
}