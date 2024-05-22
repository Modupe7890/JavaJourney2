package Chapter2;
import java.util.Scanner;

public class Exercise12 {
    // A Program that asks the user to enter two integers,
    // from the user and prints their sum, product, difference
    // and quotient (division).
    // Chapter2 Exercise 2.15
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int Product;
        int Quotient;
        int Sum;
        int Difference;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();


        Product = number1 * number2;
                System.out.printf("Product = %d%n", Product);
        Quotient = number1 / number2;
                System.out.printf("Quotient = %d%n", Quotient);
        Sum = number1 + number2;
                System.out.printf("Sum = %d%n", Sum);
        Difference = number1 - number2;
                System.out.printf("Difference = %d%n", Difference);

    }
}
