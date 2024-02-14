import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userTempC, tempF;
        String trash;

        //Collect temp
        System.out.println("Please enter the temperature in Celsius: ");

        if (in.hasNextDouble()) {

            userTempC = in.nextDouble();
            tempF = userTempC * 9/5 + 32;

            System.out.println("Your temp in C is " + userTempC + "°C \nYour temp in F is " + tempF + "°F");

        }

        else {

            trash = in.nextLine();
            System.out.println("You gave me an invalid value: " + trash);

        }

    }
}
