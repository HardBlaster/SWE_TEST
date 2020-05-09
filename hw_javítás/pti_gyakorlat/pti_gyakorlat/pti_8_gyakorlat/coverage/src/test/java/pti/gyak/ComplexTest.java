package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testBalAg() {
        Complex complex = new Complex();
        assertEquals(-354, complex.func(354, 400, 300));
    }

    @Test
    public void testBalKozepAg() {
        Complex complex = new Complex();
        assertEquals(-400, complex.func(594, 400, 300));
    }

    @Test
    public void testJobbAg() {
        Complex complex = new Complex();
        assertEquals(365, complex.func(365, 300, 400));
    }

    @Test
    public void testJobbKozepAg() {
        Complex complex = new Complex();
        assertEquals(300, complex.func(594, 200, 300));
    }
}