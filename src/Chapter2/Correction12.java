package Chapter2;
import java.util.Scanner;

public class Correction12 {
    // A Program that asks the user to enter two integers,
    // from the user and prints their sum, product, difference
    // and quotient (division).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int Product;
        int Quotient;
        int Sum;
        int Difference;

        System.out.println("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        number2 = input.nextInt();


        Product = number1 * number2;
        System.out.printf("%s%n Product = ", Product);
        Quotient = number1 / number2;
        System.out.printf("%s%n Quotient = ", Quotient);
        Sum = number1 + number2;
        System.out.printf("%s%n Sum = ", Sum);
        Difference = number1 - number2;
        System.out.printf("%s%n Difference = ", Difference);

}
}

