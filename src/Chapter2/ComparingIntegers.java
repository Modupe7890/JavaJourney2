package Chapter2;
import java.util.Scanner;
public class ComparingIntegers {
    // A program that compares two integers
    // Chapter2 Exercise 2.16
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first Integer: ");
        number1= input.nextInt();
        System.out.print("Enter the second Integer: ");
        number2= input.nextInt();

            if (number1 == number2) {
                System.out.print("The number is equal");
            }
            if(number1 > number2) {
                System.out.printf("Number1 is greater %d%n", number1);
            }
            if (number1<number2){
                System.out.printf("Number1 is smaller %d%n", number1);
            }
            if (number2>number1){
                System.out.printf("Number2 is greater %d%n", number2);
            }
            if (number2<number1){
                System.out.printf("Number2 is smaller %d%n", number2);
            }
    }
}
