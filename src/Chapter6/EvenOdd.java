package Chapter6;
import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first integer (or 0 to exit)");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if (isEven(num)) {
                System.out.println(input + " is an even number.");
            } else {
                System.out.println(input + " is not an even number.");
            }
        }

    }
}


