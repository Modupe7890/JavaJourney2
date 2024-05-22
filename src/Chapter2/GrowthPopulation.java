package Chapter2;
// Making a difference Question 2
// Exercise 2.34
import java.util.Scanner;
public class GrowthPopulation {
    // A program that calculate the world growth population
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double population = 8.100000000;
        double growth_rate ;
        double Result;

        System.out.println("Enter the growth_rate in percentage: ");
        growth_rate = input.nextDouble()/100;

        Result = population * growth_rate * 1;
        System.out.printf("The estimate world population after a year is %s%n", Result);

        Result = population * growth_rate * 2;
        System.out.printf("The estimate world population after 2years is %s%n", Result);

        Result = population * growth_rate * 3;
        System.out.printf("The estimate world population after 3years is %s%n", Result);

        Result = population * growth_rate * 4;
        System.out.printf("The estimate world population after 4years is %s%n", Result);

        Result = population * growth_rate * 5;
        System.out.printf("The estimate world population after 5years is %s%n", Result);

    }
}
