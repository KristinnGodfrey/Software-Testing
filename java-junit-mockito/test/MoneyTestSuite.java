package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        MoneyStackTest.class,
        MoneyStackWithMockTest.class
})
public class MoneyTestSuite {
    // empty class used to run test suite
}
