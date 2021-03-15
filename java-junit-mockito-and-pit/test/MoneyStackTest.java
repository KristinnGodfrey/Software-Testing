package test;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import main.Money;
import main.MoneyStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyStackTest {
    MoneyStack ms;
    Money a;
    Money b;

    @Before
    public void setUp() throws Exception {
        ms = new MoneyStack();
        a = new Money(9);
        b = new Money(2);
    }

    @Test
    public void testPushPop() {
        ms.push(a);
        ms.push(b);
        assertSame(b, ms.pop());
        assertSame(a, ms.pop());
    }

    @Test
    public void isFull() {
        for (int i = 0; i < ms.getTheCapacity(); i++) {
            assertFalse(ms.isFull());
            ms.push(a);
        }
        assertTrue(ms.isFull());
    }

    @SuppressFBWarnings("UC_USELESS_VOID_METHOD")
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
        for (int i = 0; i <= ms.getTheCapacity(); i++) {
            ms.push(a);
        }
        ms.push(a);
    }

    @Test
    public void testCompareMoney() {

    }

    @SuppressFBWarnings("UC_USELESS_OBJECT")
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        ms.pop();
    }

    @Test
    public void testMoneyFalse() {
        Money b = new Money(2);
        String a = "hello";
        assertFalse(b.equals(a));
    }

    @Test
    public void testToString() {
        Money a = new Money(2);

        assertEquals("2", a.toString());
    }

    @Test
    public void testisEmpty() {
        assertTrue(ms.isEmpty());
        ms.push(a);
        assertFalse(ms.isEmpty());
    }

    @Test
    public void testGetCurrentSize() {
        assertEquals(0, ms.getCurrentSize());
        ms.push(a);
        assertEquals(1, ms.getCurrentSize());
        ms.push(b);
        assertEquals(2, ms.getCurrentSize());
    }
}
