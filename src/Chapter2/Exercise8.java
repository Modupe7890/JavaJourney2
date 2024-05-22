package Chapter2;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b;
        int c;
        int a;

        System.out.print("Enter the first number: ");
        b = input.nextInt();
        System.out.print("enter the second number: ");
        c = input.nextInt();

        a = b * c;
            System.out.printf(" a is %d%n", a );
    }
}
