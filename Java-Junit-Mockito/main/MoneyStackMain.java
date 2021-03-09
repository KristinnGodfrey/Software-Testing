package main;

import static org.junit.Assert.assertEquals;

public class MoneyStackMain {
    public static void main(String[] args) {
        MoneyStack myStack = new MoneyStack();
        System.out.println("Push: 11");
        myStack.push(new Money(11));
        System.out.println("Push: 23");
        myStack.push(new Money(23));
        System.out.println("Sum=" + myStack.sum());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Sum=" + myStack.sum());
        System.out.println("Pop: " + myStack.pop());
        assertEquals(10, 10);
    }
}
