package Chapter2;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int Result;

        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();
        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        Result = x * y * z;
        System.out.printf("The product is %d%n", Result );
    }
}
