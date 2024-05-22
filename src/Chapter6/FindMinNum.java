package Chapter6;
import java.util.Scanner;
public class FindMinNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = input.nextDouble();

        double result = minimum3(num1, num2, num3);

        System.out.println("The smallest number is: " + result);
    }
    public static double minimum3(double num1, double num2, double num3) {
        double minOfFirstTwo = Math.min(num1, num2);

        return Math.min(minOfFirstTwo, num3);

    }
}