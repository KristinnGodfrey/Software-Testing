package main;

public class IntStack {
    private static final int theCapacity = 10;
    private int[] theStack;
    private int nextPushLocation; // Location in theStack array, where next push
    // will insert. 0 means: stack is empty.

    public IntStack() {
        theStack = new int[IntStack.theCapacity];
        nextPushLocation = 0;
    }

    public boolean isEmpty() {
        if (nextPushLocation == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (nextPushLocation == theCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) throws ArrayIndexOutOfBoundsException {
        theStack[nextPushLocation++] = element;
    }

    public int pop() throws ArrayIndexOutOfBoundsException {
        return theStack[--nextPushLocation];
    }

    public int getCurrentStackSize() {
        return nextPushLocation;
    }
}
