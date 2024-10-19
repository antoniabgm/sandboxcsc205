package sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListQueueTest {

    private ArrayListQueue<Integer> queue;


    @BeforeEach
    void setUp() {
        queue = new ArrayListQueue<>();
    }

    @Test
    void testOffer() {
        assertTrue(queue.offer(1));
        assertTrue(queue.offer(2));
        assertEquals(2, queue.queue.size());
    }

    @Test
    void testPoll() {
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.poll());
        assertEquals(1, queue.queue.size());
        assertEquals(2, queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPeek() {
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.peek());
        assertEquals(2, queue.queue.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.offer(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    void testPollEmptyQueue() {
        assertNull(queue.poll());
    }

    @Test
    void testPeekEmptyQueue() {
        assertNull(queue.peek());
    }

    @Test
    void testOfferNull() {
        queue.offer(null);
        assertEquals(1, queue.queue.size());
    }
}