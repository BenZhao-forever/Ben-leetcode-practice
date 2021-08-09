import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyQueueTest {
    MyQueue myQueue = new MyQueue();
    @Test
    void push() {
        myQueue.push(1);
        myQueue.push(2);

    }
    @Test
    void pop() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        myQueue.pop();
        myQueue.push(6);
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
    }

    @Test
    void peek() {
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
    }
    @Test
    void empty() {
        myQueue.push(1);
        assertFalse(myQueue.empty());
    }
}