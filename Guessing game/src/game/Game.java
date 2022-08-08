package game;
import java.util.Scanner;
public class Game {
   private boolean gameActive = true;

    public String newGame() {
       return ("Do you wanna play one more time?");
   }

   public void cancelGame() {
       System.out.println("You don't wanna play( \nBye...");
       this.gameActive = false;
   }

   public String greeting() {
       return ("Lets play a number guessing game! \nDo you wanna play? yes or no");
   }

   public String tooBig() {
       return ("Your number is too big ");
   }

    public String tooSmall() {
        return ("Your number is too small ");
    }

    public String win(int current_answer) {
        return ("That's right! The number was  " + current_answer + "\nYou won!!! ");
    }

    public boolean isGameActive() {
       return this.gameActive;
    }

    public void guessNumber (int current_answer, Scanner myObj) {
        while (true) {
            try {
                System.out.println("Try to guess it now! ");
                int answer = Integer.parseInt(myObj.nextLine());
                if (answer == current_answer) {
                    System.out.println(this.win(current_answer));
                    break;
                } else if (answer > current_answer) {
                    System.out.println(this.tooBig());
                } else {
                    System.out.println(this.tooSmall());
                }
            } catch (Exception e) {
                System.out.println(error.Error.notNumber());
            }
        }
    }
}