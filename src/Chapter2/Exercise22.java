package Chapter2;
// Exercise2.26
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        // A program that accept 2 integers and determines the multiple
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        System.out.println("Make sure the first number is greater than the second number to get accurate answer");
        System.out.println("----------------------------------------------------------");
        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();


        if (number1 % number2 >=1){
            System.out.printf("The second number %d is not a multiple of the first number %d%n",number2, number1);
        }
        if (number1 % number2 ==0){
            System.out.printf("The Second number %d is a multiple of the first number %d%n",number2, number1);
        }
    }
}
