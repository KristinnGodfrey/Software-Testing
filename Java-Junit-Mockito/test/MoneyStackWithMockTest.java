package test;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import main.Money;
import main.MoneyStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MoneyStackWithMockTest {
    Money myMock;
    MoneyStack ms;

    @Before
    public void setUp() throws Exception {
        myMock = mock(Money.class);
        ms = new MoneyStack();
    }

    @Test
    public void testMoneySum() {
        Money a = new Money(1);
        int testLength = 5;

        for (int i = 0; i < testLength; i++) {
            ms.push(a);
        }
        assertEquals(ms.sum(), testLength * 1);
    }

    @SuppressFBWarnings("RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT")
    @Test
    public void testMoneySumMock() {
        int testLength = 5;

        for (int i = 0; i < testLength; i++) {
            ms.push(myMock);
        }
        when(myMock.getAmount()).thenReturn(1);
        assertEquals(testLength * 1, ms.sum());
        verify(myMock, times(testLength)).getAmount();


    }
}
