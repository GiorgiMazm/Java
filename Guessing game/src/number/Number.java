package number;
import java.util.Random;
import java.util.Scanner;
public class Number {
    public int randomNum(Scanner myObj) {
        int min_number;
        int  max_number;
        while (true) {
            try {
                min_number = this.chooseMin(myObj);
                max_number = this.chooseMax(myObj);

                if (min_number < 1 || max_number < 1) {
                    System.out.println(error.Error.onlyPositiveNumbers());
                    continue;
                } else if (max_number < min_number) {
                    System.out.println(error.Error.maxSmallerMin());
                    continue;
                } else if (max_number == min_number) {
                    System.out.println(error.Error.minEqualsMax());
                    continue;
                }
                System.out.println("I have just chosen a number! ");
                break;
            } catch (Exception e) {
                System.out.println(error.Error.notNumber());
            }
        }
        Random rand = new Random();
        int upperbound = max_number - min_number;
        return rand.nextInt(upperbound) + min_number;
    }

    public int chooseMin(Scanner myObj) {
        System.out.println("choose min number");
        return Integer.parseInt(myObj.nextLine());
    }

    public int chooseMax(Scanner myObj) {
        System.out.println("choose max number");
        return Integer.parseInt(myObj.nextLine());
    }

}