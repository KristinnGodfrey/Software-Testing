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
        for (int i = 0; i < ms.getTheCapacity() - 1; i++) {
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

    @SuppressFBWarnings("UC_USELESS_OBJECT")
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        ms.pop();
    }
}
