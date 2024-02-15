import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userLength, userWidth, perimeter, area, diagonal, userDiagSquared;
        String trash;

        //collect dimensions
        System.out.println("What is the length of your rectangle?");

        if (in.hasNextDouble()) {

            userLength = in.nextDouble();

            System.out.println("What is the width of your rectangle?");

            if (in.hasNextDouble()) {

                userWidth = in.nextDouble();

                perimeter = userLength * 2 + userWidth * 2;
                area = userLength * userWidth;
                userDiagSquared = (userWidth * userWidth) + (userLength * userLength);
                diagonal = Math.sqrt(userDiagSquared);

                System.out.println("The Perimeter: " + perimeter + "\nArea: " + area + "\nDiagonal: " + diagonal);

            }

            else {

                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);

            }

        }

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);

        }


    }
}
