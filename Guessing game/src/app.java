import game.Game;
import java.util.Objects;
import number.Number;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        var myGame = new Game();
        var myNum = new Number();

        while (myGame.isGameActive()) {
            Scanner myObj = new Scanner(System.in);
            System.out.println(myGame.greeting());
            var gameDesire = myObj.nextLine().toLowerCase();

            if (Objects.equals(gameDesire, "yes")) {

                int current_answer = myNum.randomNum(myObj);
                myGame.guessNumber(current_answer, myObj);

            } else {
                myGame.cancelGame();
                break;
            }
            System.out.println(myGame.newGame());
        }
    }
}