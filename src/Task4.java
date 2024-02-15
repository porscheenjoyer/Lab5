import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userMeters, miles, inches, feet;
        String trash;

        //Collect meters
        System.out.println("Enter the distance in meters: ");

        if (in.hasNextDouble()) {

            userMeters = in.nextDouble();

            miles = userMeters * 0.000621371;
            inches = userMeters * 39.3701;
            feet = userMeters * 3.28084;

            System.out.println("The distance in: \n Meters: " + userMeters + "m \n Miles: " + miles + "mi \n Inches: " + inches + "in \n Feet: " + feet + "ft");

        }

        else {

            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);

        }

    }
}
