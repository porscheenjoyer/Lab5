import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Declare Imports
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Variables
        int randNum = rand.nextInt(10) + 1;
        int userNum;
        String trash;

        //Collect user Guess
        System.out.println("Guess a number 1 through 10: ");

        if (in.hasNextInt()) {

            userNum = in.nextInt();

            if (userNum == randNum) {

                System.out.println("You won!");

            }

            else if (userNum < randNum) {

                System.out.println(":( Your number was too small, try again.");

            }

            else if (userNum > randNum) {

                System.out.println(":( Your number was too big, try again.");

            }

        }

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);

        }

    }
}
