package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testResult() {
        assertEquals(6.0, new Calculator().enter(5).enter(Operation.ADD).enter(1).getResult());
    }

    @Test
    public void testHistory() {
        Calculator calculator = new Calculator();
        assertEquals("", calculator.getHistory());
        assertEquals("5 + 1 = 6\n", calculator.enter(5).enter(Operation.ADD).enter(1).getHistory());
        calculator.enter(Operation.CLEAR);
        assertEquals("5 + 1 = 6\n1 + 1 = 2\n", calculator.enter(1).enter(Operation.ADD).enter(1).getHistory());
        calculator.enter(Operation.CLEAR);
        assertEquals("5 + 1 = 6\n1 + 1 = 2\n1 + 2 = 3\n", calculator.enter(1).enter(Operation.ADD).enter(2).getHistory());
    }

    @Test
    public void testAdd() {
        assertEquals(11.0, new Calculator().enter(6).enter(Operation.ADD).enter(5).getResult());
    }

    @Test
    public void testSubtract() {
        assertEquals(3.0, new Calculator().enter(8).enter(Operation.SUBSTRACT).enter(5).getResult());
    }

    @Test
    public void testDivide() {
        assertEquals(0.0, new Calculator().enter(0).enter(Operation.DIVIDE).enter(20).getResult());
        assertEquals(Double.NEGATIVE_INFINITY, new Calculator().enter(-1).enter(Operation.DIVIDE).enter(0).getResult());
        assertEquals(Double.POSITIVE_INFINITY, new Calculator().enter(1).enter(Operation.DIVIDE).enter(0).getResult());
    }

    @Test
    public void testRemainder() {
        assertEquals(2.0, new Calculator().enter(10).enter(Operation.REMAINDER).enter(4).getResult());
    }

    @Test
    public void testMultiply() {
        assertEquals(1.0, new Calculator().enter(1).enter(Operation.MULTIPLY).enter(1).getResult());
    }

    @Test
    public void testPow() {
        assertEquals(16.0, new Calculator().enter(2).enter(Operation.POWER).enter(4).getResult());
    }

    @Test
    public void testSqrt() {
        assertEquals(2.0, new Calculator().enter(4).enter(Operation.SQRT).getResult());
    }

    @Test
    public void testEnterClear() {
        assertEquals(0, new Calculator().enter(Operation.CLEAR).getResult());
    }

    @Test
    public void testNull() {
        Operation operation = null;
        Number number = null;
        Calculator calculator = new Calculator();
        assertEquals(calculator, calculator.enter(1).enter(operation).enter(number));
    }
}