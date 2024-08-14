package CognifyzInternshipProjects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please kindly read through and follow the instructions.");
        System.out.println("-------------------------------------------------------");

        System.out.print("Enter your Temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Select your preferred Conversion Option");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int Option = scanner.nextInt();

        double convertedTemp;
        switch (Option){
            case 1:
                convertedTemp = fahrenheitToCelsius(temp);
                System.out.println(temp+ "°F is" + convertedTemp+ "°C is");
                break;
            case 2:
                convertedTemp = celsiusToFahrenheit(temp);
                System.out.println(temp+ "°C is" + convertedTemp+ "°F is");
                break;
        }
    }
}
