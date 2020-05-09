package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

    Simple simple = new Simple();

    @Test
    public void testBalAg() {
        assertEquals(354, simple.func(354, 400, 300));
    }

    @Test
    public void testKozepAg() {
        assertEquals(123, simple.func(756, 123, 458));
    }

    @Test
    public void testJobbAg() {
        assertEquals(486, simple.func(453, 486, 543));
    }
}