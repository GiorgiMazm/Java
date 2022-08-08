package error;

public class Error {
    public static String notNumber() {
        return "That was not a number!";
    }

    public static String onlyPositiveNumbers() {
        return "Sorry, but our game is only for positive numbers";
    }

    public static String minEqualsMax() {
        return "Sorry, but max number can not be equal to min number (no point for game)";
    }

    public static String maxSmallerMin() {
        return "Sorry, but max number can not be smaller that min number";
    }
}
