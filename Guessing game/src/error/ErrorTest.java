package error;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorTest {
    @Test
    void ifNumber() {
        assertEquals("That was not a number!", error.Error.notNumber());
    }

    @Test
    void ifNegativeNumber() {
        assertEquals("Sorry, but our game is only for positive numbers", error.Error.onlyPositiveNumbers());
    }

    @Test
    void ifMinEqualsMax() {
        assertEquals("Sorry, but max number can not be equal to min number (no point for game)", error.Error.minEqualsMax());
    }

    @Test
    void ifMaxSmallerMin() {
        assertEquals("Sorry, but max number can not be smaller that min number", error.Error.maxSmallerMin());
    }
}