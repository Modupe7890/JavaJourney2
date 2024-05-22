package Chapter1;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int divide;

        System.out.println("Enter the first Number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second Number: ");
        num2 = input.nextInt();

        divide = num1/num2;
        System.out.printf("Division = %d%n ",divide);
    }



}
