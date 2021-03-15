package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.IntStack;

import static org.junit.Assert.*;

public class IntStackStepdefs {
    private IntStack theStack;
    private Boolean actualBooleanAnswer;
    private int actualIntValue;


    @Given("a new stack")
    public void newStack() {
        theStack = new IntStack();
    }

    @When("I check whether it is empty")
    public void checkWhetherItIsEmpty() {
        actualBooleanAnswer = theStack.isEmpty();
    }

    @When("I check whether it is full")
    public void iCheckWhetherItIsFull() {
        actualBooleanAnswer = theStack.isFull();
    }

    @Then("it should answer yes")
    public void itShouldAnswerYes() {
        assertTrue(actualBooleanAnswer);
    }

    @Then("it should answer no")
    public void itShouldAnswerNo() {
        assertFalse(actualBooleanAnswer);
    }

    @When("I push {int}")
    public void iPush(int int1) {
        theStack.push(int1);
    }

    @When("I push {int} {int} times")
    public void iPushTimes(int value, int times) {
        for (int i = 0; i < times; i++) {
            theStack.push(value);
        }
    }

    @When("I pop")
    public void iPop() {
        actualIntValue = theStack.pop();
    }

    @Then("it should return {int}")
    public void itShouldReturn(int int1) {
        assertEquals(int1, actualIntValue);
    }

    @When("I check the size of the stack")
    public void iCheckTheSizeOfTheStack() {
        actualIntValue = theStack.getCurrentStackSize();
    }
}
