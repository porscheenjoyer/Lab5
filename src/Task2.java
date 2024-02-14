import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double gasTank, gasMileage, gasPrice, cost100M, range;
        String trash;

        //Collect Info
        System.out.println("How much gas is in your tank?");

        if (in.hasNextDouble()) {

            gasTank = in.nextDouble();

            System.out.println("What is the miles per gallon of your car?");

            if (in.hasNextDouble()) {

                gasMileage = in.nextDouble();

                System.out.println("What is the current cost of gas?");

                if (in.hasNextDouble()) {

                    gasPrice = in.nextDouble();

                    cost100M = 100 / gasMileage * gasPrice;

                    range = gasTank * gasMileage;

                    System.out.println("Your fuel cost for 100 miles is: $" + cost100M + "\nThe range of your car is: " + range + " mi");

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

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid Value: " + trash);

        }

    }
}
