package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void newGame() {
        var game = new Game();
        assertEquals("Do you wanna play one more time?", game.newGame());
    }

    @Test
    void greeting() {
        var game = new Game();
        assertEquals("Lets play a number guessing game! \nDo you wanna play? yes or no", game.greeting());
    }

    @Test
    void tooBig() {
        var game = new Game();
        assertEquals("Your number is too big ", game.tooBig());
    }

    @Test
    void tooSmall() {
        var game = new Game();
        assertEquals("Your number is too small ", game.tooSmall());
    }

    @Test
    void win() {
        var game = new Game();
        int number = 5;
        assertEquals("That's right! The number was  " + number + "\nYou won!!! ", game.win(number));
    }

    @Test
    void isGameActiveForTrue() {
        var game = new Game();
        assertTrue(game.isGameActive());
    }

    @Test
    void isGameActiveForFalse() {
        var game = new Game();
        game.cancelGame();
        assertFalse(game.isGameActive());
    }
}