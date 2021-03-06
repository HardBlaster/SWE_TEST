package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    Complex complex = new Complex();

    @Test
    public void testBalAg() {
        assertEquals(354, complex.func(354, 400, 300));
    }

    @Test
    public void testBalKozepAg() {
        assertEquals(420, complex.func(387, 450, 420));
    }

    @Test
    public void testJobbAg() {
        assertEquals(354, complex.func(524, 680, 354));
    }

    @Test
    public void testJobbKozepAg() {
        assertEquals(354, complex.func(354, 752, 456));
    }
}