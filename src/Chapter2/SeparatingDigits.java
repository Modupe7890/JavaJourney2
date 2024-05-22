package Chapter2;
// Exercise 2.30
import java.util.Scanner;
public class SeparatingDigits {
    // A program that separate the digit in integers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a 5-Digits number: ");
        number = input.nextInt();

        int number1 =number/10000;
        int number2 =number%10000/1000;
        int number3 =number%1000/100;
        int number4 =number%100/10;
        int number5 =number%10;

        System.out.printf(number1+ "   "+number2+"   "+number3+"   "+number4+"   "+number5);


    }
}
